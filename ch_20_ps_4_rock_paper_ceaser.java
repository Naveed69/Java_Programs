package com.Wing;
import java.util.Scanner;
import java.util.Random;
public class ch_20_ps_4_rock_paper_ceaser {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int a;

        Random rand = new Random();
        int user=0,sys=0;
        int r;
        r=rand.nextInt(3);
        for(int i=5;i>=1;i--)
        {
            System.out.println("Select any one number.\n0.Rock.\n1.Paper.\n2.ceasor");
            a=s.nextInt();
            r=rand.nextInt(3);
            System.out.println(r);
            if(a==0 && r ==1)
                sys=sys+1;
            else if(a==0 && r==2)
                user=user+1;
            if(a== 2 && r==3)
                sys=sys+1;
            else if(a==1 && r==0)
                user=user+1;
            if(a==2 && r==0)
                sys=sys+1;
            else if(a==2 && r==1)
                user=user+1;
        }
        if(user>sys)
            System.out.println("User wins");
        else
            System.out.println("System wins");
    }
}
