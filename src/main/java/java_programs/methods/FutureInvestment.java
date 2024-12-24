package java_programs.methods;

import java.util.Scanner;

//Write a Java method to compute the future investment value at a given
//interest rate for a specified number of years (Consider simple interest only Sum = P*N*R)
public class FutureInvestment {

    public static float computeInvestmentValue(int p, float n, float r){
        float sum = 0;
        sum = p * n * r/100;
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        int amount = input.nextInt();
        System.out.println("Enter the time period: ");
        float n = input.nextFloat();
        System.out.println("Enter the rate of interest: ");
        float roi = input.nextFloat();

        float output = FutureInvestment.computeInvestmentValue(amount,n,roi);
        System.out.println("Total Interest: " + output);

    }

}
