package com.Wing;

class EkClass{
    int a;
    public EkClass(int a){
        this.a=a;
    }
    public int getA(){
        return a;
    }
    public int return1(){
    return 1;
    }
}

class DoClass extends EkClass{
    public DoClass(int c){
        super(c);
        System.out.println("Mai ek constructor hu");
    }
}

public class ch_47_this_super {
    public static void main(String[] args) {

        EkClass ec=new EkClass(5);

        DoClass dc=new DoClass(6);
        System.out.println(dc.getA());
    }
}
