package com.yyaccp.common;

public class RandomUtil {
    public static String random(int length) {
        String d = ""+Math.random();
        return d.substring(d.indexOf(".")+1,d.indexOf(".")+5);
    }

    public static void main(String[] args) {
        for (int i=0;i<10;i++) {
            System.out.println(RandomUtil.random(4));
        }
    }
}
