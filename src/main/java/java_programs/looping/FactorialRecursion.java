package java_programs.looping;

import java.util.Scanner;

//Find factorial of a number (Apply recursion)
public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int output = FindFactorial.fact(num);
        System.out.println("Factorial of " + num +" is " +output);
    }
}

class FindFactorial {
    static int  count = 1; //used a global variable here with the keyword "static" so that it can be used in a local environment such as the fact function down below
    public static int fact(int num){
    count = count*num;


    if (num <=1){
        return  count;
    }
       return fact(num-1);
    }
}
