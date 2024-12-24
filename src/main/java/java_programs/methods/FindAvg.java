package java_programs.methods;

//Implement a method to find the average of a set of numbers
class Perform{
    public static double findAvg(int[] args){
        int count = args.length;
        double sum = 0;
        double avg = 0;

        for(int i=0;i<count;i++){
            sum +=args[i];
        }

        avg = sum/count;
        return avg;
    }
}
public class FindAvg {
    public static void main(String[] args) {
        int[] arr = {10, 2, 38, 23, 38, 23, 21};

        double output = Perform.findAvg(arr);
        System.out.println(output);
    }
}
