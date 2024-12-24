package java_programs.methods;
import java.util.Scanner;

//Implement a method to find power nth of a number
class NthPower{
    public int findPower(int number , int power){
        int sum = 1;
        for(int i=1;i<=power;i++){
            sum  = number * sum;
        }
        return sum;
    }
}
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = input.nextInt();
        System.out.println("Enter the power: ");
        int power = input.nextInt();

        NthPower np = new NthPower();
        int output = np.findPower(number,power);
        System.out.println("The power of " + number + " is "  + output);
    }
}
