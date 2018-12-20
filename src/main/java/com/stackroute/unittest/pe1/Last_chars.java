package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class Last_chars {
    public static String addsubstr(String s, int n){

        String sb = s.substring(s.length()-n,s.length());
        for(int i=0;i<n;i++){
            s = s + sb;
        }

        return s;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a  String:");
        String s = scan.next();
        System.out.println("Enter the integer:");
        int n = scan.nextInt();

        String str = addsubstr(s,n);
        System.out.print(str);

    }

}
