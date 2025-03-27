package TP4.Exo1;

public class LignePolygonale {
    private Point[] sommets;

    LignePolygonale(int taille) {
        sommets = new Point[taille];
    }

    LignePolygonale(Point[] sommets) {
        this.sommets = sommets;
    }

    public Point getSommet(int index) {
        try {
            return this.sommets[index];
        } 
        catch (Exception e) {
            return null;
        }
    }

    public void setSommet(int index, Point p) {
        this.sommets[index] = p;
    }

    public String toString() {
        String str = "[ ";
        for (int i=0; i<sommets.length; i++){
            if (i==sommets.length -1){
                str += sommets[i].toString();
            }
            else{
                str += sommets[i].toString() + ", ";
            }
        }
        str += " ]";
        return str;
    }

    public void translater(int dx, int dy) {
        for (int i=0; i<sommets.length; i++){
            sommets[i].translation(dx, dy);
        }
    }

    public double longueur() {
        double res = 0;
        for (int i=0; i<sommets.length -1 ; i++){
            res += sommets[i].distanceA(sommets[i+1]);
        }
        return res;
    }
    
    public boolean estFermee() {
        return sommets[0].equals(sommets[sommets.length-1]);
    }
    
    public static void main(String[] args){
        Point point0 = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 2);
        Point[] sommets = new Point[] {point0, point1, point2};
        LignePolygonale test = new LignePolygonale(sommets);
        System.out.println(test.getSommet(3));
        System.out.println(test.toString());
        test.translater(1, -1);
        System.out.println(test.toString());
        System.out.println(test.longueur());

    }
}
