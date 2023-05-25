package com.Wing;
import java.util.Scanner;
public class ch_19_ps_4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //p1
//        int a,b,c;
//        float r=0;
//        a=s.nextInt();
//        b=s.nextInt();
//        c=s.nextInt();
//        r = (a + b + c) / 3f;
//        if(r>=40.0 && a>=33 && b>=33 && c>=33)
//            System.out.println("Pass");
//        else
//            System.out.println("fail");

        //p2
//        float tax=0;
//        float income=s.nextFloat();
//
//        if(income >2.5 && income <=5)
//        {
//            tax=tax+0.05f*(income-2.5f);
//        }
//        if(income >5 && income <= 10)
//        {
//            tax=tax+0.05f*(5.0f-2.5f);
//            tax=tax+0.2f*(income-5f);
//        }
//
//        if(income > 10)
//        {
//            tax=tax+0.05f*(5.0f-2.5f);
//            tax=tax+0.2f*(10.0f-5f);
//            tax=tax+0.3f*(income - 10.0f);
//        }
//
//        System.out.println(tax);

            //p5 leap year
        int y=s.nextInt();
        if(y%4==0 && (y%400==0 || y%100!=0))
            System.out.println("leap year");
        else
            System.out.println("Not leap year");


            //p6
//        String url=s.next();
//
//        if(url.endsWith(".org"))
//            System.out.println("This is an organization web site");
//        if(url.endsWith(".com"))
//            System.out.println("This is an Commercial web site");
//        if(url.endsWith(".in"))
//            System.out.println("This is an indian web site");

    }
}
