
package com.stackroute.unittest.pe1;
import java.util.Scanner;

class Alphabet_check {
    public static  String  fun(String str)
    {

        if(str.charAt(0)>='a'&&str.charAt(0)<='z')
            return(str.charAt(0)+" "+"is a small letter");
        else if(str.charAt(0)>='A'&& str.charAt(0)<='Z')
            return(str.charAt(0)+" "+"is a capital letter");
        else if(str.charAt(0)>='0'&&str.charAt(0)<='9')
            return(str.charAt(0)+" "+"is a digit");
        else
            return(str.charAt(0)+" "+"is a special char");
    }

    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);

        String str= in.nextLine();
        String  str1=fun(str);
        System.out.print(str1);



    }
}
