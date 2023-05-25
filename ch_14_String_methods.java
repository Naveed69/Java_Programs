package com.Wing;

import java.util.Locale;

public class ch_14_String_methods {
    public static void main(String[] args) {
        String st="Naveed";
/*
        st.length();
        st.toLowerCase();
        st.toUpperCase();
        st.trim();
        st.substring(2);
        st.substring(2,4);
        st.replace('v','w');
        st.replace("vee","jii");
        st.startsWith("na");  //true or false
        st.endsWith("ed"); //true or false
        st.charAt(2);
        st.indexOf('a'); // st.indexof("ed");
        st.indexOf('e',4); //if didn't find it will return -1
        st.lastIndexOf('e');
        st.lastIndexOf('e',3);
        st.equals("Naveed");
        st.equalsIgnoreCase("naveed");
        escape sequence charecter
        \n \t \" \\ etc
*/

        System.out.println(st);
        int l=st.length();
        System.out.println(l);
        System.out.println(st.toLowerCase());
        System.out.println(st.toUpperCase());
        System.out.println(st.trim());
        System.out.println(st.substring(2));
        System.out.println(st.substring(2,4));
        System.out.println(st.replace('e','i'));
        System.out.println(st.replace("ee","i"));
        System.out.println(st.startsWith("n"));
        System.out.println(st.endsWith("ed"));
        System.out.println(st.charAt(2));
        System.out.println(st.indexOf('a'));
        System.out.println(st.indexOf('e',3));
        System.out.println(st.lastIndexOf('e'));
        System.out.println(st.lastIndexOf('e',4));
        System.out.println(st.equals("Naveed"));
        System.out.println(st.equalsIgnoreCase("naveed"));


    }
}
