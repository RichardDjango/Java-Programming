import java.util.Scanner;

//Check if the given number is even or odd
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check :  ");
        int num = sc.nextInt();

        for(int i=1; i<=10;i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }

    }
}
