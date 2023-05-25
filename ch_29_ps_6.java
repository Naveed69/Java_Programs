package com.Wing;
import java.util.Scanner;
public class ch_29_ps_6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //p1
//        float a[]=new float[5];
//        float sum=0;
//        for(int i=0;i<5;i++) {
//            a[i] = s.nextFloat();
//            sum=sum+a[i];
//        }
//        System.out.println(sum);
//        System.out.println("average is: "+sum/a.length);
//
//        //p2
//        float n=5;
//        boolean is=false;
//        for(int i=0;i<5;i++)
//            if(a[i]==n){
//                is=true;
//            break;
//            }
//        if(is)
//            System.out.println("present");
//        else System.out.println("not present");

        //p4
/*        float a[][]=new float[2][3];
        float b[][]=new float[2][3];
        float c[][]=new float[2][3];
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++)
            a[i][j] = s.nextFloat();
        }

        for(int i=0;i<b.length;i++) {
            for(int j=0;j<b[i].length;j++)
                b[i][j] = s.nextFloat();
        }

        for(int i=0;i<c.length;i++) {
            for(int j=0;j<c[i].length;j++)
                c[i][j] = a[i][j] + b[i][j];
        }

        for(int i=0;i<c.length;i++) {
            for(int j=0;j<c[i].length;j++) {
                System.out.print(c[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

 */
        //p6
        int a[]={10,20,30,40,45};
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(max < a[i])
                max=a[i];
        }
        System.out.println("maximun number: "+max);
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(min > a[i])
                min=a[i];
        }
        System.out.println("maximun number: "+min);

        boolean b=true;
        max=0;
        for(int i=0;i<a.length;i++)
        {
            if(max <= a[i])
                max=a[i];
            else b=false;
        }
        if(b)
        System.out.println("Sorted ");
        else System.out.println("not sorted");
    }
}
