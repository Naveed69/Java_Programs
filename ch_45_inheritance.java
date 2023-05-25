package com.Wing;

class Base{
    int x;
   /* public Base(){

    }

    */

    public void setX(int x) {
        System.out.println("I'm in base and Seeting x");
        this.x = x;
    }

    public int getX() {
        System.out.println("I'm in base and getting x");
        return x;
    }

}

class Derived extends Base{
int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class ch_45_inheritance {
    public static void main(String[] args) {

        Base b=new Base();
        b.setX(12);
        System.out.println(b.getX());


        Derived d=new Derived();
        d.setX(21);
        System.out.println(d.getX());
        d.setY(26);
        System.out.println(d.getY());
    }
}
