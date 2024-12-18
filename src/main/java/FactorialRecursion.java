import java.util.Scanner;

//Find factorial of a number (Apply recursion)
public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();


       int output = factorial(5);
        System.out.println(output);

    }
    public static int factorial(int num){
        int sum = 0;
        sum = num*sum;
        if(num > 1){
            factorial(num-1);
        }
        return sum;

    }
}
