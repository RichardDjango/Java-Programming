package java_programs.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] arr = new int[3][3]; //created 2 empty matrix's for 3x3
        int[][] res = new int[3][3];

        Scanner input = new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.println("Enter a value: ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Your Array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){

                System.out.print(arr[i][j] + " ");
                if(j == arr.length-1){
                    System.out.println(" ");
                }
            }
        }
        System.out.println("Transpose Array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                res[i][j] = arr[j][i];
                System.out.print(res[i][j] + " ");
                if(j == arr.length-1){
                    System.out.println(" ");
                }
            }
        }
    }
}
