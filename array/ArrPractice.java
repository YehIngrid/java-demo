package array;

public class ArrPractice {
    private double pi = 3.1415;
    private double radius;
    class CCircle{
        public CCircle(double r) {
            radius = r;
        }
        public double area(double radius) {
            return 2*pi;
        }
    }
    
    public static void main(String[] args) {
        CCircle cir[];
        cir = new CCircle[3];
        cir[0] = new CCircle(4.0);
        cir[1] = new CCircle(2.0);
        cir[2] = new CCircle(1.0);
        for(int i = 0; i < cir.length; i++){
            System.out.println(cir[i].area);
        }
    }
}
