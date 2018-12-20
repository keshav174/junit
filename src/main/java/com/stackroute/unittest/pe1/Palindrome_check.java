package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class Palindrome_check {
    public static String palindromeCheck(int num){

        boolean flag = false;
        int sum=0;

        String res = "";
        String s = Long.toString(num);
        StringBuilder sb = new StringBuilder(s);


        StringBuilder rev = new StringBuilder(s);
        rev = rev.reverse();
        System.out.println(sb);
        System.out.println((rev.toString()).equals(sb.toString()));

        if(rev.toString().equals(sb.toString())) {
            flag = true;
        }
        else{
            res = "Not a Palindrome";
        }
        /* System.out.println(flag);*/




        if(flag) {
            while (num != 0) {
                int n = num % 10;
                num = num / 10;
                if (n % 2 == 0) {
                    sum = sum + n;
                }
            }

            if (sum > 25)
                res = "is a palindrome and the sum of even numbers is greater than 25";
            else
                res = "is a palindrome and the sum of even numbers is less than 25";

        }

        return res;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the number:");
        int num = scan.nextInt();

        String str = palindromeCheck(num);


    }
}

