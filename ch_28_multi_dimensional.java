package com.Wing;

public class ch_28_multi_dimensional {
    public static void main(String[] args) {
        int ar[][]=new int[2][4];
        ar[0][0]=5;
        System.out.println(ar[0][0]);
        ar[0][1]=5;
        ar[0][2]=5;
        ar[0][3]=5;
        ar[1][0]=5;
        ar[1][1]=5;
        ar[1][2]=5;
        ar[1][3]=5;
        System.out.println(ar.length);
        System.out.println(ar[0].length);
        for(int i=0;i<ar.length;i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
