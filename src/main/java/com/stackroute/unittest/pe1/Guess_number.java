package com.stackroute.unittest.pe1;
import java.util.Scanner;

public class Guess_number {
    public static String guess(int num){
        int n = 76;
        String str = "";
        Scanner scan = new Scanner(System.in);
        while(num != n){

            if(num < n){
                str ="Entered number is less than original number";
            }
            else{
                str = "Entered number is more than original number";
            }
            System.out.println("Enter again");
            num = scan.nextInt();
        }

        str = "Number guessed matches the original number";
        return str;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1-100!");
        int num = scan.nextInt();

        String s = guess(num);

    }
}
