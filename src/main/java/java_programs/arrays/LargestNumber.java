package java_programs.arrays;

import java.util.Arrays;
import java.util.Scanner;

//12. Find the smallest no from an array
public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arraySize = input.nextInt();

        int[] arr = new int[arraySize];

        for(int i=0; i<arraySize;i++) {
            System.out.println("Enter the element: ");
            arr[i] = input.nextInt();
        }
        System.out.println("your array: " + Arrays.toString(arr));

        //finding smallest number logic
        int largest = arr[0];

        for(int j=1;j<arr.length;j++){
            if(largest < arr[j]){
                largest = arr[j];
            }
        }
        System.out.println("The largest number in the array is: " + largest);

    }
}
