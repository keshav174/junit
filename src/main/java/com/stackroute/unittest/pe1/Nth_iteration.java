package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class Nth_iteration {
    public static  String fun(int n)
    {
        StringBuffer str1=new StringBuffer();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                str1.append(i);
        }
        return  str1.toString();

    }
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String str1=fun(n);
        System.out.print(str1);

    }
}