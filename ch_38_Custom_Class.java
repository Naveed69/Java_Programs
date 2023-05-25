package com.Wing;

class Employee{
    int id;
    int salary;
    String name;
    public void showDetails(){
        System.out.println("My id is: "+id);
        System.out.println("My name is: "+name);
    }
    public int getSalary(){
        return salary;
    }
}

public class ch_38_Custom_Class {
    public static void main(String[] args) {
        System.out.println("Custom class");
        Employee e=new Employee();
        Employee r=new Employee();
        //Setting attribute
        e.id=12;
        e.salary=32;
        e.name="naveed";
        int saln=e.getSalary();

        r.id=11;
        r.salary=29;
        r.name="Roma";
        int sal=r.getSalary();


        // printing attribute
//        System.out.println(e.id);
//        System.out.println(e.name);
        e.showDetails();
        System.out.println(saln);
        r.showDetails();
        System.out.println(sal);
    }
}
