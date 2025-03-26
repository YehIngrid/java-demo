package array;

public class TwoDArray {
    public static void main(String[] args) {
        int score[][];
        score = new int[3][4];
        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[0].length; j++){
                System.out.print("("+i+","+j+")");
            }
            System.out.println("");
        }
    }
}
