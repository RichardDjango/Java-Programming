package java_programs.arrays;

//Find the sum of nos in an array
public class SumOfNumbers {
    public static void main(String[] args) {

        int[] myArray = {54,76,43,89,32,54};

        int sum = 0;
        for(int i=0; i<myArray.length;i++){
            sum +=  myArray[i];
        }
        System.out.println("The sum of the array is: " + sum);
    }
}
