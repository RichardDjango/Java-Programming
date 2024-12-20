package java_programs.arrays;


public class MatrixExample {
    public static void main(String[] args) {
        int[][] lotteryCard = {
                               {20,15,7},
                               {8,47,19},
                               {65,13,4}
                                        };
        int[][] lotteryCard2 = new int[3][3];
        lotteryCard2[0][0] = 20;
        lotteryCard2[0][1] = 54;
        lotteryCard2[0][2] = 76;

        lotteryCard2[1][0] = 43;
        lotteryCard2[1][1] = 98;
        lotteryCard2[1][2] = 32;

        lotteryCard2[2][0] = 34;
        lotteryCard2[2][1] = 98;
        lotteryCard2[2][2] = 87;

        for(int i= 0; i<lotteryCard.length;i++){
            for(int j=0; j< lotteryCard.length; j++){
                System.out.print(lotteryCard[i][j]+ " ");
                if(j==lotteryCard2.length-1){
                    System.out.println(" ");
                }
            }
        }
    }
}
