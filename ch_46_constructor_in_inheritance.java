package com.Wing;

class Base1{
    int x;

    public Base1() {
        System.out.println("im constructor");
    }

    public Base1(int x) {
        System.out.println("im overloaded constructor: "+x);

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1{
    int y;

    public Derived1(){
        //super(10);
        System.out.println("i'm in Derived Constructor");
    }

    public Derived1(int x,int y){
        super(x);
        System.out.println("i'm in overloaded Derived Constructor: "+y);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class ChildDerived extends Derived1{
    int y;
    public ChildDerived(){
        System.out.println("i'm in Derived Constructor of child");
    }
    public ChildDerived(int x,int y,int z){
        super(x,y);
        System.out.println("i'm in Derived Constructor of child overloaded: "+z);
    }

}
public class ch_46_constructor_in_inheritance {
    public static void main(String[] args) {

//        Base1 b=new Base1();
//        b.setX(20);
//       // System.out.println(b.getX());
//        Derived1 d=new Derived1(1,2);
//        d.setY(30);
//        //System.out.println(d.getY());

        ChildDerived cd = new ChildDerived(12,13,14);
    }
}
