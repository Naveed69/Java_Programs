package com.Wing;

public class ch_3_09_pre_asso {
    public static void main(String[] args) {
        //precedence and associativity
        int a=6*5-34/2;
        System.out.println(a);
        int b=60/5-34*2;
        System.out.println(b);

        int c=4;
        int k=b*b- (4*a*c)/(2*a);
    }
}
