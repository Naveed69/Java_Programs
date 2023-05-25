package com.Wing;

import java.util.Scanner;

public class ch_13_4_strings {
    public static void main(String[] args) {
        String s1=new String("naveed");
        System.out.println(s1);

        String s="naveed";
        System.out.println(s);

        //System.out.printf();
        int a=6;
        float b=5.7647f;
        System.out.printf("a=%d and b=%.2f",a,b);

        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        String st1=sc.nextLine();
        System.out.println(st);
        System.out.println(st1);

    }
}
