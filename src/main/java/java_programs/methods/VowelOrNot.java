package java_programs.methods;

import java.util.Scanner;

public class VowelOrNot {

    public static String isVowel(String character){
        String vowels = "aeiou";
            if(vowels.contains(character)){
                return character + " is a Vowel";
            }else {
                return  character + " is not a Vowel";
            }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character to check if its a vowel: ");
        String character = input.nextLine();

        String output = VowelOrNot.isVowel(character);
        System.out.println(output);
    }
}
