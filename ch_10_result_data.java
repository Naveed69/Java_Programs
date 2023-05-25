package com.Wing;

public class ch_10_result_data {
    public static void main(String[] args) {
        //resulting data type after 2 data type added
        /*
        i+s=i
        s+i=i
        l+f=f
        i+f=f
        c+i=i
        c+s=i
        l+d=d
        f+d=d
         */

        //increment and decrement

        int i=56;
        int a=i++;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(a);

        char c='a';
        System.out.println(++c);
    }
}
