package com.Wing;

class A {
    public int Meth1() {
        System.out.println("hi i'm in meth1 of class A");
        return 5;
    }

    public void Meth2() {
        System.out.println("hi i'm in meth2 of class A");
    }

}
class B extends A{
    @Override
    public void Meth2() {
        System.out.println("hi i'm in meth2 of class B");
    }
    public void Meth3(){
        System.out.println("i'm method 3 of class B");
    }
}

public class ch_48_Method_Ovverridding {
    public static void main(String[] args) {

//        A a=new A();
//        a.Meth1();
//        a.Meth2();

        B b=new B();
        b.Meth2();
    }
}
