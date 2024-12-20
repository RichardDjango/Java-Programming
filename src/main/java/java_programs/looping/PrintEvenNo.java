package java_programs.looping;

import java.util.Scanner;

//Print all even numbers up to n
public class PrintEvenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int count = sc.nextInt();
        System.out.println("The Even numbers upto " + count + " are : ");

        if(count > 0){
            for(int i=0; i<count; i++){
                if(i%2 == 0){

                    System.out.print( i + " ");
                }
            }
        }else {
            System.out.println("Invalid entry. Enter a valid number!");
        }

    }
}
