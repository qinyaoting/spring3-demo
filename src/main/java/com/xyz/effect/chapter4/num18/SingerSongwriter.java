package com.xyz.effect.chapter4.num18;

import java.applet.AudioClip;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 5/26/14
 * Time: 9:06 PM
 * To change this template use File | Settings | File Templates.
 */
public interface SingerSongwriter extends Singer, SongWriter {

    AudioClip strum();
    void actSensitive();

    //虽然接口不允许包含方法的实现，但是，使用接口来定义类型并不妨碍你为程序提供实现上的帮助
    //通过对你导出的每一个重要接口都提供一个抽象的骨架实现类，把接口和抽象类的优点结合起来

    //AbstractCollection AbstractsSet AbstractList AbstractMap骨架

}
