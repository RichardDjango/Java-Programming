package java_programs.arrays;

//11. Print the elements in a one dimensional array in reverse order

import java.util.Arrays;
import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arraySize = input.nextInt();  //took the count from the user to know the size of the array

        int[] arr = new int[arraySize]; //created an empty array with the size provided by the user

        for(int i=0; i<arraySize;i++){        //the arraysize number determines how many times the loop should run to fill the array completely
            System.out.println("Enter the element: ");
            arr[i] = input.nextInt();  //appending each input given by the user into the array
        }
        System.out.println("Array before reversing: " + Arrays.toString(arr));


        for(int i=0; i<arr.length/2;i++){       //reversing the string logic
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i ];
            arr[arr.length-1-i] = temp;
        }
        System.out.println("Array after reversing: " + Arrays.toString(arr));

    }
}
