package TP1;
public class Exo2_2 {
    private static double PRECISION = Math.pow(10,-6);
    public static void main(String[] args){
        double sum = 0.0;
        int i = 0;
        boolean next = true;
        while(next){
            double precedent = sum;
            sum += Math.pow(-1,i) * 1.0/(2*i+1);
            i += 1;
            if (Math.abs(sum-precedent) <= PRECISION) {
                next = false;
            }
        }
        System.out.println("pi = " + sum *4 + "\nnb itération : " + i);
    }
}
