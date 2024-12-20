package java_programs.looping;

import java.util.Scanner;

// Check if the given number is even or odd
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check :  ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println(num +" is a Even number.");
        }else {
            System.out.println(num + " is a Odd number.");
        }

    }
}
