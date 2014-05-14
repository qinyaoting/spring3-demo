package com.xyz.design_pattern.chapter16;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/13/14
 * Time: 11:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    static int hour = 0;
    static boolean workFinished = false;

    public static void writeProgram() {
        /*if (hour < 12) {
            System.out.println("当前时间" + hour + "上午工作，精神百倍");
        } else if (hour <13) {
            System.out.println("当前时间" + hour + "饿了，午饭， 犯困，午休");
        } else if (hour <17) {
            System.out.println("当前时间" + hour + "下午状态不错，继续努力");
        } else {
            if (workFinished) {
                System.out.println("当前时间" + hour + "下班回家");
            } else {
                if (hour < 21) {
                    System.out.println("当前时间" + hour + "工作没完成，加班，疲劳之际");
                } else {
                    System.out.println("当前时间" + hour + "工作没完成，不行了，睡着了");
                }
            }
        }*/

        //==========================================================
        Work emergencyProjects = new Work();
        emergencyProjects.setHour(9);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(10);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(12);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(13);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(14);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(17);
        emergencyProjects.setFinish(false);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(19);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(22);
        emergencyProjects.writeProgram();
        //==========================================================


    }


    public static final void main(String[] args) {
        hour = 9;
        writeProgram();
        hour = 10;
        writeProgram();
        hour = 12;
        writeProgram();
        hour = 13;
        writeProgram();
        hour = 14;
        writeProgram();
        hour = 17;
        writeProgram();

        workFinished = true;
        writeProgram();
        hour = 19;

        writeProgram();
        hour = 22;
        writeProgram();
    }
}
