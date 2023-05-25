package com.Wing;

class Cylinder{
    private int radius,height;

    public Cylinder(int r,int h){
        this.radius=r;
        this.height=h;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
        return 2*Math.PI*radius*radius + 2*Math.PI  *radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

class Reactangle{
    private int length,breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public Reactangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Reactangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

public class ch_44_ps_9 {
    public static void main(String[] args) {


        //p1
        Cylinder c=new Cylinder(9,12);
      //  c.setHeight(12);
       // c.setRadius(9);

        /*
        p1
        System.out.println(c.getHeight());
        System.out.println(c.getRadius());


        System.out.println(c.surfaceArea());
        System.out.println(c.volume());
 */
        Reactangle r=new Reactangle(3,4);
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
    }
}
