package com.stackroute.unittest.pe1;
import java.util.Scanner;

public class Reverse_string {
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

    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        String str=in.nextLine();
        char tempArray[] = str.toCharArray();
        String str1=Reverse(tempArray);
        System.out.println(str1);
    }

}
