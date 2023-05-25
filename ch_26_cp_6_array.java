package com.Wing;

public class ch_26_cp_6_array {
    public static void main(String[] args) {
        int ar[]=new int[5];
        ar[0]=5;
        int ar1[]={1,2,3,4};
        System.out.println(ar[0]);
        //array length
        System.out.println(ar1.length);

        String []stu={"naveed","roma"};
        for(int i=0;i<stu.length;i++)
            System.out.println(stu[i]);

        for(int i:ar1)
            System.out.println(i);
    }
}
