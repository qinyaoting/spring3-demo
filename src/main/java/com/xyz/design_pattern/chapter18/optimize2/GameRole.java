package com.xyz.design_pattern.chapter18.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/15/14
 * Time: 5:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameRole {

    private int vit;
    private int atk;
    private int def;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public GameRoleMemonto saveState() {
        return new GameRoleMemonto(vit, atk, def);
    }

    public void recoveryState(GameRoleMemonto memento) {
        this.vit = memento.getVid();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    public void stateDisplay() {
        System.out.println("===== 角色当前状态 =====");
        System.out.println("体力：" + this.vit);
        System.out.println("攻击：" + this.atk);
        System.out.println("防御：" + this.def);
        System.out.println("=======================");
    }

    public void getInitState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }


}
