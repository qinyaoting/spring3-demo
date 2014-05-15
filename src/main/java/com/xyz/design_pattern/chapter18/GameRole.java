package com.xyz.design_pattern.chapter18;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/15/14
 * Time: 5:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameRole {

    private int vit;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    private int attack;

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    private int defense;

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void stateDisplay() {
        System.out.println("===== 角色当前状态 =====");
        System.out.println("体力：" + this.vit);
        System.out.println("攻击：" + this.attack);
        System.out.println("防御：" + this.defense);
        System.out.println("=======================");
    }

    public void getInitState() {
        this.vit = 100;
        this.attack = 100;
        this.defense = 100;
    }

    public void fight() {
        this.vit = 0;
        this.attack = 0;
        this.defense = 0;
    }
}
