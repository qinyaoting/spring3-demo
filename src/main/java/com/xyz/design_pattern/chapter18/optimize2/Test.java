package com.xyz.design_pattern.chapter18.optimize2;


import com.xyz.design_pattern.chapter18.optimize.Caretaker;
import com.xyz.design_pattern.chapter18.optimize.Originator;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 2:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    // 备忘录模式：（Memento）在不破坏封装性的前提下，捕获一个对象的内部状态
    // 并在该对象之外保存这个状态，这样以后就可将该对象恢复到原来的保存的状态


    public static final void main(String[] args) {


        GameRole lixiaoyao = new GameRole();

        lixiaoyao.getInitState();
        lixiaoyao.stateDisplay();

        // 保存进度
        RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
        stateAdmin.setMemonto(lixiaoyao.saveState());

        // 大战Boss，损耗严重，没血了
        lixiaoyao.fight();
        lixiaoyao.stateDisplay();

        // 恢复之前的状态
        lixiaoyao.recoveryState(stateAdmin.getMemonto());
        lixiaoyao.stateDisplay();
    }



}
