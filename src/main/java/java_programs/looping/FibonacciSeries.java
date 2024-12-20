package java_programs.looping;

import java.util.Scanner;

//Write a program to print Fibonacci series of n terms. Ex : 0 1 1 2 3 5 8 13 24 …..n

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number limit to generate Fibonacci series: ");
        int limit = sc.nextInt();

        int firstNumber = 0;
        int secondNumber = 1;

        for(int i=0; i<limit;i++){
            if(i == 0){
                System.out.println("Fibonacci series for your input is: ");
            }
            System.out.print(firstNumber + " ");
            int thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }

    }
}
