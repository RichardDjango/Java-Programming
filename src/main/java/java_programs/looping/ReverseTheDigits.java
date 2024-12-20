package java_programs.looping;

import java.util.Scanner;

//Reverse the digits in a number. For example, if the number is 12345, the
//output should be 54321
public class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a series of numbers that is less than 10 digits: ");
        int num = sc.nextInt();

        int remainder = 0;
        int reverse = 0;

        while(num>0){
            remainder = num%10;
            reverse = reverse * 10 + remainder;
            num = num/10;
        }
        System.out.println(reverse);








    }
}