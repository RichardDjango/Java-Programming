package java_programs.arrays;

import java.util.Scanner;

//14. Search for an element in an array
public class FindElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the brand to search: ");
        String myBrand = input.next();

        String[] str = {"Ferrari", "Mercedes", "BMW", "Volkswagon", "Mazda", "Ford"} ;
        for(int i=0; i<str.length; i++) {
            if (str[i].equals(myBrand)) {
                System.out.println(str[i] + " has been found");
                break;
            }
            }
        }

            }


