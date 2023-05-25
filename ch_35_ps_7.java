package com.Wing;

import java.util.Scanner;

public class ch_35_ps_7 {
    //p1
    static void mul(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = "+ n*i);
        }
    }
    //p2
    static void pattern(int a)
    {
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    //p3 recursive function
    static int sum(int n)
    {
        if(n==1)
            return 1;
     return n+=sum(n-1);

    }

    //p4 reverse function
    static void rev(int a)
    {
        for(int i=a;i>0;i--)
        {
            for(int j=i;j>0;j--)
                System.out.print("* ");
            System.out.println();
        }
    }
      // 1 2 3 4 5 6 7 8  9  10
    //p5 0 1 1 2 3 5 8 13 21 34
    static int fib(int a)
    {
        if(a==1 || a==2)
            return a-1;

        /*if(a==1)
            return 0;
        else if(a==2)
            return 1;
         */

        else return fib(a-1)+fib(a-2);
    }

    //p6
    static void avg(int ...a)
    {
        int avg=0;
        for(int i:a)
            avg +=i;
        System.out.println(avg/a.length);
    }

    //p7
    static void pattern_rec(int a)
    {
        if(a>0) {
            pattern_rec(a - 1);
            for(int i=0;i<a;i++)
            System.out.print("* ");
            System.out.println();
        }
    }

    //p8.1
    static void pattern_rec_rev_row(int x)
    {
        if(x>0) {
            System.out.print("* ");
            pattern_rec_rev_row(x - 1);
        }
    }

    //p8.2
 public static void pattern_rec_rev(int a)
    {
        if(a>0) {
            pattern_rec_rev_row(a);
            System.out.println();
            pattern_rec_rev(a - 1);
        }
    }
    public static void main(String[] args) {


        //p1
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
       // mul(n);


        //p2
       // pattern(n);

        //p3 recursive function to calculate sum of n natural number
        //System.out.println(sum(n));

        //p4 print pattern reverse
        //rev(n);

        //p5 fibonacci series 0 1 1 2 3 5 8 13 21
        //System.out.println(fib(n));

        //p6 avvg of passed argument
        //avg(10,20,30,40,50);

        //pattern using recursion
        //pattern_rec(n);

        //p8
        pattern_rec_rev(n);
    }
}
