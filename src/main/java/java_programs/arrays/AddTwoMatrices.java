package java_programs.arrays;

//Add two matrices
public class AddTwoMatrices {
    public static void main(String[] args) {
        int[] myArray1 = {65,92,45,68,42,31,65,97};
        int[] myArray2 = {54,76,32,76,43,78,12,34};
        int sum = 0;
        for(int i=0; i<myArray1.length;i++){
           sum = sum + myArray1[i] + myArray2[i];
        }
        System.out.println(sum);
    }
}
