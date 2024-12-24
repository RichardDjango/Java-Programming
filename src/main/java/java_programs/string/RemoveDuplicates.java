package java_programs.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Remove duplicate characters from a string
public class RemoveDuplicates {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a word to find the mulitple occurances of a character: ");
//        String str = input.nextLine();
//
//        char[] charArr = str.toCharArray();
//
//        Map<Character, Integer> myMap = new HashMap<Character, Integer>();
//
//        for (char myChar : charArr) {
//            if (myMap.containsKey(myChar)) {
//                myMap.put(myChar, myMap.get(myChar) + 1);
//            } else {
//                myMap.put(myChar, 1);
//            }
//        }
//        System.out.println(myMap);


        String sentence = "Richardddd";
        String characters = "";
        String duplicates = "";

        for(int i=0;i<sentence.length();i++){
            String currentChar = Character.toString(sentence.charAt(i));

            if(characters.contains(currentChar)){
                duplicates += currentChar;
            }else {
                characters +=currentChar;
            }
    }
        System.out.println(characters);



}}
