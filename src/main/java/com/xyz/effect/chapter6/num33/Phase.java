package com.xyz.effect.chapter6.num33;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 5/29/14
 * Time: 10:30 PM
 * To change this template use File | Settings | File Templates.
 */
public enum  Phase {
    SOLID, LIQUID, GAS;

//    public enum Transition {
//        MELT,FREEZE, BOIL, CONDENSE, SUBLIME, DEPOSIT;
//
//        private static final Transition[][] TRANSITIONS = {
//                {null,      MELT,       SUBLIME},
//                {FREEZE,    null,       BOIL},
//                {DEPOSIT,   CONDENSE,   null}
//        };
//
//        public static Transition from(Phase src, Phase dst) {
//            return TRANSITIONS[src.ordinal()][dst.ordinal()];
//        }
//    }


    public enum Transition {
        MELT(SOLID, LIQUID),    FREEZE(LIQUID, SOLID),
        BOIL(LIQUID,GAS),       CONDENSE(GAS,LIQUID),
        SUBLIME(SOLID,GAS),     DEPOSIT(GAS,SOLID);

        private final Phase src;
        private final Phase dst;

        Transition(Phase src, Phase dst) {
            this.src =  src;
            this.dst = dst;
        }

        private static final Map<Phase,Map<Phase, Transition>> m =
                new EnumMap<Phase, Map<Phase, Transition>>(Phase.class);

        static {
            for (Phase p : Phase.values())
                m.put(p,new EnumMap<Phase, Transition>(Phase.class));

            for (Transition trans: Transition.values()) {
                m.get(trans.src).put(trans.dst, trans);
            }



        }
        public static Transition form(Phase src, Phase dst) {
            return m.get(src).get(dst);
        }
    }
}
