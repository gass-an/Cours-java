package TP1;
public class Exo2_1 {

    private static int N = 10000;
    public static void main(String[] args){
        double sum = 0.0;
        for(int i=0; i<=N;i++){
            sum += Math.pow(-1,i) * 1.0/(2*i+1);
        }
        System.out.println("pi = " + sum *4);
    }
}
