package com.Wing;
import java.util.Scanner;
public class ch_15_ps_3 {
    public static void main(String[] args) {
        String st="  Naveed";
        Scanner sc=new Scanner(System.in);
        //p1
        System.out.println(st.toLowerCase());
        //p2
        System.out.println(st.replace(' ','_'));
        //p3
        String letter ="Dear <|Name|>, Thanks a lot!";
        System.out.println(letter.replace("<|Name|>","Naveed"));

        //p4
        String myString = "This string contains    double and tripe spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //p5
        String letter1="Dear Naveed,\n\tThis java course is nice. \nThanks!";
        System.out.println(letter1);

    }
}
