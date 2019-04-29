package com.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

public class Test {
    public static void main(String[] args) {
        String aa = "0|[1-9][0-9]*";
        String regex1 = "\\d{n}";
        String regex2 = "\\.{2}";
        String email = "\\w{5,15}@[0-9a-zA-Z]+(\\.[0-9a-zA-Z]+)+";
        String str= "sljfd_lsj45@sdjf34.sf334.com";

        boolean b1 = str.matches(email);
        boolean b2 = str.matches(regex2);

        System.out.println(b1);
        System.out.println(b2);


        Pattern p1 = Pattern.compile(email);
        Matcher m = p1.matcher(str);
        boolean b11 = m.matches();

        System.out.println(b11);
    }
}
