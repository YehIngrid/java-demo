package array;

public class CharArray {
    public static void main(String[] args) {
        char[] chrs = {'a', 'b','c'};
        for(int i = 0; i < chrs.length; i++) {
            System.out.println(chrs[i]);
        }
        String s = new String(chrs);
        System.out.println(s);
    }
}
