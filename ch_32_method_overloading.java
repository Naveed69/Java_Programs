package com.Wing;

public class ch_32_method_overloading {
    static void joke(){
        System.out.println("new joke");
    }
    static void ar(int x[])
    {
        x[0]=11;
    }
    public static void main(String[] args) {
        joke();
        int a[]={10,20,30,40,50};
        ar(a);
        System.out.println(a[0]);
    }
}
