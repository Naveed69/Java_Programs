package com.Wing;
class MyMainEmployee{
    int id;
    String name;

//    public MyMainEmployee() {
//        id=40;
//        name="Navid";
//    }

    public MyMainEmployee(String name,int id){
        this.name=name;
        this.id=id;
    }

    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return name;
    }
}

public class ch_42_Constructor {
    public static void main(String[] args) {
     MyMainEmployee m= new MyMainEmployee("roma",24);
        System.out.println(m.id);
        System.out.println(m.name);
    }
}
