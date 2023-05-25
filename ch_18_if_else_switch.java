package com.Wing;
import java.util.Scanner;
public class ch_18_if_else_switch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();

        //if else
        if(age>=18 && age<65)
            System.out.println("if  you can drive");
        else
            System.out.println("if You can't drive");

        //Switch

        switch (age){
            case 18:
                System.out.println("switch you can drive");
                break;
            case 60:
                System.out.println("switch you can't drive die");
                break;
            default:
                System.out.println("die first");
        }

        // enhanced switch imp
        String st="n";
        switch (st) {
            case "n" -> {
                System.out.println("The letter is n");
                System.out.println("the enhanced switch");
            }
            case "r" -> System.out.println("The letter is r");
            case "x" -> System.out.println("The letter is x");
            default -> System.out.println("dd");
        }
    }
}
