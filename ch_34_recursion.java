package com.Wing;

public class ch_34_recursion {
    static int fact(int a)
    {
        if(a==1 || a==0)
            return 1;
        else
            return a*fact(a-1);
    }
    static int fib(int z) //try this in recursion
    {
        int n=0,x=0,y=1;
        System.out.println(x+"\n"+y);
        while(true)
        {

            n=x+y;
            if(z<=n)
                break;
            x=y;
            y=n;
            System.out.println(n);

        }
        return n;
    }
    public static void main(String[] args) {

        System.out.println(fact(3));
        fib(10);
    }
}
