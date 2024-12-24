package java_programs.methods;

import java.util.Scanner;

//Write a Java method to check whether a year (integer) is a leap year or
//not.
public class LeapYearOrNot {
    public static String checkLeapYear(int year){
        if(year % 100 == 0 & year % 400 == 0 || year % 100 != 0 & year % 4 == 0){
           return "YES";
        }else {
            return "NO";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int year = input.nextInt();

        String output = LeapYearOrNot.checkLeapYear(year);
        if(output.equals("YES")){
            System.out.println(year + " is a Leap Year");
        }else if(output.equals("NO")) {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
