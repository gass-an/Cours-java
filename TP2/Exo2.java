package TP2;
public class Exo2 {
    private double x;
    private double y;

    Exo2(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void translation(double dx, double dy){
        this.x = x + dx;
        this.y = y + dy;
    }

    public String toString(){
        String str = String.format("(%.2f , %.2f)", x,y);
        System.out.println(str);
        return str;
    }

    public static void main(String[] args){
        Exo2 test = new Exo2(2, -2);
        test.translation(0.5, 0.5);
        test.toString();
    }
}
