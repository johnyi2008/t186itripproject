package com.yyaccp.common;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5 {
    public static String md5(String src) {
        return DigestUtils.md5Hex(src);
    }

    public static void main(String[] args) {
        System.out.println(MD5.md5("ABC"));
        System.out.println(MD5.md5("ABC"));
        System.out.println(MD5.md5("123456"));
        System.out.println(MD5.md5("123456"));
    }
}
