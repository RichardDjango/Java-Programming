package java_programs.arrays;

//Find the second largest no in an array

public class SecondLargest {
    public static void main(String[] args) {
        int[] myArray = {65,92,45,68,42,31,60,97};
        int secondLargest = 0;
        for(int i=0;i<myArray.length;i++){
            for(int j=0;j<myArray.length-1;j++){
                if(myArray[j] > myArray[j+1]){
                    int temp = myArray[j+1];
                    myArray[j+1] =myArray[j];
                    myArray[j] = temp;
                    secondLargest = myArray[myArray.length-2];
                }
            }
        }
        System.out.println("The second largest number in the array is: "+ (secondLargest));
    }
}
