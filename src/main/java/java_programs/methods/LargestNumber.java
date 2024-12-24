package java_programs.methods;
import java.util.Scanner;

//Implement a method to find the largest among n numbers
public class LargestNumber {

    public static int largest(int[] arr){
        int largest = arr[0];

        for(int j=1;j<arr.length;j++){
            if(largest < arr[j]){
                largest = arr[j];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the limit for the number of values in the list: ");
        int count = input.nextInt();

        int[] arr = new int[count];

        for(int i=0; i<count;i++){
            System.out.println("Enter the number: ");
            arr[i] = input.nextInt();
        }
        int largest = LargestNumber.largest(arr);
        System.out.println("The largest number is: " + largest);
    }
}
