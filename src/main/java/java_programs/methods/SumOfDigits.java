package java_programs.methods;

import java.util.Scanner;

//Write a Java method to compute the sum of the digits in an integer
public class SumOfDigits {
    public static int findSum(String digits){
        int sum = 0;
        String[] str = digits.split("");
        for (int i=0;i<str.length;i++){
          int singleDigit =  Integer.parseInt(str[i]);
          sum = sum + singleDigit;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a set of numbers to find the total: ");
        String digit = input.nextLine();

        int output = SumOfDigits.findSum(digit);
        System.out.println(output);
    }

}
