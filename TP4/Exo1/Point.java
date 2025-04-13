package TP4.Exo1;

public class Point {
    private double x;
    private double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void translation(double dx, double dy){
        this.x = x + dx;
        this.y = y + dy;
    }

    public double distanceA(Point p){
        return Math.sqrt(Math.pow(p.x - this.x,2) + Math.pow(p.y - this.y,2));
    }

    public boolean equals(Point p){
        return p.x == this.x && p.y == this.y;
    }

    public String toString(){
        String str = String.format("(%.2f , %.2f)", x,y);
        System.out.println(str);
        return str;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public static void main(String[] args){
        Point test = new Point(2, -2);
        test.translation(0.5, 0.5);
        //test.toString();
    }
}
