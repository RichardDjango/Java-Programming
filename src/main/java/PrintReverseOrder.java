import java.util.Scanner;

//Print first n numbers in the reverse order
public class PrintReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int count = sc.nextInt();

        System.out.println("Reverse order from " + count + " to " + ((count-count)+1) + " is: ");
        for(int i=count; i>0; i--){
            System.out.print(i + " ");
        }
    }
}
