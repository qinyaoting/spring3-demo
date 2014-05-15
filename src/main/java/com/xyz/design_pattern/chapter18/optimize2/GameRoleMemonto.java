package com.xyz.design_pattern.chapter18.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/15/14
 * Time: 5:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameRoleMemonto {

    private int vid;
    private int atk;
    private int def;

    public GameRoleMemonto(int vid, int atk, int def) {
        this.vid = vid;
        this.atk = atk;
        this.def = def;
    }

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
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
}
