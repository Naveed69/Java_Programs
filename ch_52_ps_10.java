package com.Wing;
class circle{
    int radius;

    public circle(){
        System.out.println("non parameter constructor of circle");
    }
    public circle(int r) {
        System.out.println("I'm circle parameter constuctor");
        this.radius=r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends circle{
    int height;
    Cylinder1(int r,int h){
    super(r);
        System.out.println("I'm cylinder parameter constuctor");
    this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*height;
    }
}
public class ch_52_ps_10 {
    public static void main(String[] args) {
        //p1
       // circle objc=new circle(12);
        Cylinder1 c=new Cylinder1(12,4);
    }
}
