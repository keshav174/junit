package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class Vowel_Cons {
    public static String fun(String str)
    {
        int temp =str.charAt(0);
        if(temp>='a'&& temp<='z'||temp>='A'&&temp<='Z')
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||
                        str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
                    return ("Vowel ");
                else
                    return ("Consonant ");
            }

        return ("Error");
    }

    public static void main(String[] args)
    {

        Scanner in=new Scanner(System.in);

        String str=in.nextLine();
        String str1=fun(str);


    }
}