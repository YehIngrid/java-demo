package array;
public class Arrays {
    public static void main(String[] args) {
        int score[];
        score = new int[4];
        for(int i = 0; i < score.length; i++) {
            score[i] = i;
            System.out.println(score[i]);
        }
    }
}