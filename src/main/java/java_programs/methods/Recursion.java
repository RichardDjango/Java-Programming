package java_programs.methods;

import java.util.Scanner;

//Find factorial of a number using recursion
public class Recursion {
    static int  sum = 1;
    public static int fact(int num) {

        while (num >= 1) {
            sum = sum * num;

            if(num <= 1){
                return sum;
            }
            return fact(num-1);
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fact = input.nextInt();
        System.out.println("Enter a number to find the factorial: ");
        int output = Recursion.fact(fact);
        System.out.println("The factorial of " + fact + " is " + output);

    }


}
