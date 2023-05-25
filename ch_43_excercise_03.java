package com.Wing;

import java.util.Random;
import java.util.Scanner;

class game{
    private int ran,unum,guess=1;

    public int getRan() {
        return ran;
    }

    public int getGuess() {
        return guess;
    }

    public int getUnum() {
        return unum;
    }

    Scanner s= new Scanner(System.in);
    public game(){
        Random rand = new Random();
        ran=rand.nextInt(100);
        System.out.println(ran);
    }

    public void takeUserInput()
    {
        System.out.println("Enter a number between 0-100");
        unum=s.nextInt();
    }

    public boolean isCorrectNumber(){

        if(getRan() > getUnum()){
            System.out.println("Your number is smaller guess bigger number!");
            guess +=1;
            takeUserInput();
        }
        if(getRan() < getUnum()){
            System.out.println("Your number is Bigger guess smaller number!");
            guess +=1;
            takeUserInput();
        }
        if(getRan()==getUnum())
        return false;
        else return true;
    }
}
public class ch_43_excercise_03 {
    public static void main(String[] args) {
        /*
        Create class game, Which allows a user to play "guess the number"
        game once. Game should have the following methods:
        1. Constructor to generate the random number
        2. takeuserInput() to take user input
        3. isCorrectNumber() to detect whether entered number by the user is true
        4. getter and setter for noOfguess()
        use properties such as noOfguess(int),etc yo get this task done
         */
        game g=new game();
        g.takeUserInput();
        while(g.isCorrectNumber())
        {
            g.isCorrectNumber();
        };
        System.out.println("Correct guess in: "+g.getGuess()+" Cycle");
    }
}
