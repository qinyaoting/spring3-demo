package com.xyz.effect.chapter6.num33;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 5/29/14
 * Time: 10:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Herb {     //烹饪用的香草

    public enum Type{ANNUAL, PERENNIAL, BIENNIAL}

    private final String name;
    private final Type type;

    public Herb(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }



    public static final void main(String[] args) {


        Herb[] garden = new Herb[0];
        /*Set<Herb>[] herbsByType = (Set<Herb>[])new Set[Herb.Type.values().length];
        for (int i=0;i<herbsByType.length;i++) {
            herbsByType[i] = new HashSet<Herb>();
        }

        for (Herb h : garden) {
            herbsByType[h.type.ordinal()].add(h);
        }

        for (int i=0;i<herbsByType.length;i++) {
            System.out.printf("%s: %s%n",
                    Herb.Type.values()[i], herbsByType[i]);
        } */

        Map<Herb.Type, Set<Herb>> herbsByType = new EnumMap<Type, Set<Herb>>(Herb.Type.class);

        for(Herb.Type t: Herb.Type.values())
            herbsByType.put(t, new HashSet<Herb>());

        for (Herb h: garden) {
            herbsByType.get(h.type).add(h);

            System.out.print(herbsByType);
        }
    }
}
