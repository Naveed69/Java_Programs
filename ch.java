package com.Wing;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ch {

    public static void main(String[] args) {
	double kilo;
    Scanner s=new Scanner(System.in);
        System.out.println("Enter Kilometer");
        kilo=s.nextDouble();
        double mile=kilo*0.6213712;
        System.out.println(kilo+" Kilometer in Miles is "+mile);

    }
}
