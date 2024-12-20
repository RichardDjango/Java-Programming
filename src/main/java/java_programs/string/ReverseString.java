package java_programs.string;

import java.util.Scanner;

//19. Reverse a string
public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String str = input.next();
        String reversed = "";
        for(int i=str.length()-1;i>=0;i--){
            reversed = reversed+str.charAt(i);
        }
        System.out.println("The reversed string is: " + reversed);
    }
}
