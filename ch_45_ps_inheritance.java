package com.Wing;

class Animal{
    String name;
    int age;

    public Animal(){

    }

    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }


    public String getName()
    {
        return name;
    }

    public int getAge(){
        return age;
    }

}

class Dog extends Animal{

    String bride;

    public void setBride(String bride){
        this.bride=bride;
    }
    public String getBride(){
        return bride;
    }

    public void Bark(){
        System.out.println(" bark as strong");
    }
}

public class ch_45_ps_inheritance {
    public static void main(String[] args) {

        Animal a=new Animal("street",12);
        System.out.println(a.getName());
        System.out.println(a.getAge());

        Dog d=new Dog();
        d.setBride("strong");
        System.out.println(d.getBride());

    }
}
