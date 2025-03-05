package TP1;
public class Exo1{
    public static void main(String[] args){
        double u = 1.0/3;
        for(int i=0; i<=30; i++){
            System.out.println("u" + i + " = " + u);
            u = 7 * u - 2;
        }
    }
}