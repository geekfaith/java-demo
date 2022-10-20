package com.geekfaith.demo.daily;

public class Test03 {
    public static void main(String[] args) {
//        学校/年级/班级/自增数字+两位随机数
//    String school = "bh";
//    String grade = "9";
//    String clazz = "2";
//    int num = 1;
//    String random = String.valueOf((int)(Math.random()*100));
//        for (int i = 0; i < 99; i++) {
//            String s = school + grade + clazz + String.format("%02d", num) + String.format("%02d", (int)(Math.random()*100));
//            System.out.println(s);
//            num++;
//        }

        //老师用户名
        String school = "fyl-x";
        int num = 1;
        for (int i = 0; i < 150; i++) {
            String s = school  + String.format("%03d", num) + String.format("%02d", (int) (Math.random() * 100));
            System.out.println(s);
            num++;
        }
    }
}
