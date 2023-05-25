package com.Wing;

public class ch_31_cp_7_methods {
    int lg(int x,int y)
    {
        int z;
        if(x>y)
            return x;
        else
            return y;
    }
    public static void main(String[] args) {
        ch_31_cp_7_methods obj=new ch_31_cp_7_methods();
        int a=5,b=6;
        int c=obj.lg(a,b);
        System.out.println(c);

        int a1=90,b1=9;
        int c1=obj.lg(a1,b1);
        System.out.println(c1);
    }
}
