package com.stackroute.unittest.pe1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sort_int {
    public static  String Reverse(char arr [])
    {
        int i=0;
        int j=arr.length-1;
        while(i<=j)
        {
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        String str1=new String (arr);
        return str1;
    }

    public static  String sum(char [] tempArray)
    {
        int sum=0;
        for(int i=0;i<tempArray.length;i++)
        {
            if((tempArray[i]-'0')%2==0)
                sum+=tempArray[i]-'0';
        }

        if(sum>=15)
            return "true";
        else
            return "false";

    }
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char tempArray[] = str.toCharArray();

        Arrays.sort(tempArray);
        String str1=Reverse(tempArray);
        System.out.println(str1);

        String str2=sum(tempArray);




    }
}