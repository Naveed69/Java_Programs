package com.Wing;

class Phone{

    public void greet(){
        System.out.println("good Morning");
    }
    public void on(){
        System.out.println("Turning on Phone.....");
    }
}

class SmartPhone extends Phone{

    public void music(){
        System.out.println("Apka swagat hai");
    }
    public void on(){
        System.out.println("Turning on SmartPhone.....");
    }

}

public class ch_49_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
//        Phone obj=new Phone();
//        SmartPhone smobj=new SmartPhone();
//        obj.name();

        Phone obj=new SmartPhone();  //super class can refer sub class
       // SmartPhone obj1=new Phone();  sub class can't refer Super class
        obj.greet();
        obj.on();
      //  obj.music();   Not allowed
    }
}
