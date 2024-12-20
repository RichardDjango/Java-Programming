package java_programs.string;

import java.util.Scanner;

//Check whether a string is palindrome. Eg - nun, malayalam
public class CheckPalindrome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String str = input.next();
        String reversed = "";

        for(int i=str.length()-1;i>=0;i--){
            reversed = reversed+str.charAt(i);
        }

        reversed = reversed.toLowerCase();
        str = str.toLowerCase();
        System.out.println("The reversed string is: " + reversed);
        System.out.println(" ");

        if(reversed.equals(str)){
            System.out.println("The string is Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
        }
    }

