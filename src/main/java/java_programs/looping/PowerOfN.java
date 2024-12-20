package java_programs.looping;

import java.util.Scanner;

public class PowerOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 'x' : ");
        int x = sc.nextInt();
        System.out.println("Enter the power 'n' : ");
        int n = sc.nextInt();
        int sum = x;

        for(int i=1; i<n;i++){
            {
                sum = sum*x;
            }
        }
        System.out.println(sum);
    }
}
