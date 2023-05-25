package com.Wing;

public class ch_17_logical_oprator {
    public static void main(String[] args) {
        // relational  ==,>=,<=,<,>,!=
        // logical    &&,||,!
        boolean a=true,b=false,c=true;
        if(a&&c)
            System.out.println("Y");
        else
            System.out.println("N");

        if(a||b)
            System.out.println("Y");
        else
            System.out.println("N");

        System.out.println(!a);
    }
}
