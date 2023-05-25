package com.Wing;

public class ch_33_var_args {
  static  int sum(int ...ar)      //its an int array ex : int ar[];
    {
        int result=0;
        for(int i:ar)
            result +=i;
        return result;
    }
    static  int sum1(int x,int  ...ar)      //int x is compalsary argument need to be passed its an int array ex : int ar[];
    {
        int result=x;
        for(int i:ar)
            result +=i;
        return result;
    }
    public static void main(String[] args) {
        System.out.println("welcome to java var args");
        System.out.println(sum());
        System.out.println(sum(5,6,7));
        System.out.println(sum(5,6,7,8));
        System.out.println(sum(5,6,7,8,9));

        // System.out.println(sum1()); //it will show error should pass one argument here
        System.out.println(sum1(5,6,7,10));
        System.out.println(sum1(5,6,7,10,20));

    }
}
