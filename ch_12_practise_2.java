package com.Wing;
import java.util.Scanner;
public class ch_12_practise_2 {
    public static void main(String[] args) {
        // solve the given exxpression (7/4*9/2)
        float a=7/4.0f*9/2.0f;
        System.out.println(a);

        //encript a given grade with 8 and show result witn decripting it
        char g='b';
        g=(char)(g+8);
        System.out.println(g);
        g=(char)(g-8);
        System.out.println(g);

        //given number is greater then or not
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(n>10);

        // expression
        // (v*v-u*u)/(2*a*5)

        // expression
        System.out.println(7*49/7+35/7);
    }
}
