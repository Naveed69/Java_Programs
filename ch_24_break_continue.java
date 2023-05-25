package com.Wing;

public class ch_24_break_continue {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++)
        {
            System.out.println("naveed");
            if(i==3)
                break;
        }
        int i=0;
        while(i>=5)
        {
            System.out.println(i);
            i++;
            if(i==3)
                break;
        }
        int j=0;
        do{
            System.out.println(j);
            j++;
            if(j==3)
                break;
        }while(j>=5);

        i=0;
        while(i>=5)
        {
            System.out.println(i);
            i++;
            if(i==3){
                System.out.println("Ending ittration");
                continue;}
            System.out.println("java");
            System.out.println("java new");
        }
    }
}
