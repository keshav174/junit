package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class Condition_check {
    public static String fun(int n)
    {

        if(n>20&&n<30&&n%2==0)
            return "jerry";


        if(n>20&&n<30&&n%2!=0)
            return "tom";


        else
            return " ";

    }
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();

        String  str=fun(n);

    }
}