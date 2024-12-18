import java.util.Scanner;

//Swap the numbers in two variables without using another variable
public class SwapNumbers {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for x: ");
        int x = sc.nextInt();
        System.out.println("Enter the value for y: ");
        int y = sc.nextInt();

        x = x + y;
        y = x - y;
        x = x - y ;

        System.out.println("The output of x is : " + x);
        System.out.println("The output of y is : " +y);
    }
}

