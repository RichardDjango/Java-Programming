package java_programs.branching;

import java.util.Scanner;

//Display the corresponding weekday for a given number. For instance, 1
//would correspond to Monday, 2 to Tuesday, and so forth.
public class DisplayWeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number between 1 to 7 : ");
        int weekday = sc.nextInt();

            switch (weekday) {
                case 1: {
                    System.out.println("Monday");
                    break;
                }
                case 2: {
                    System.out.println("Tuesday");
                    break;
                }
                case 3: {
                    System.out.println("Wednesday");
                    break;
                }
                case 4: {
                    System.out.println("Thursday");
                    break;
                }
                case 5: {
                    System.out.println("Friday");
                    break;
                }
                case 6: {
                    System.out.println("Saturday");
                    break;
                }
                case 7 : {
                    System.out.println("Sunday");
                    break;
                }
                default: {
                    System.out.println("Invalid input. Please try again!");
                }
            }
    }
}
