package TP4.Exo1;

public class Triangle implements Forme {
    private LignePolygonale lignePoly;
    private Point[] sommets;
    
    public Triangle(Point p1, Point p2, Point p3){
        sommets = new Point[] {p1,p2,p3,p1};
        lignePoly = new LignePolygonale(sommets);
    }
    
    public double getPerimetre(){
        return lignePoly.longueur();
    }
    
    public Forme translater(double dx, double dy){
        LignePolygonale LignePolyTrans = lignePoly;
        LignePolyTrans.translater(dx,dy);
        Triangle triangleTrans = new Triangle(
            LignePolyTrans.getSommet(0), 
            LignePolyTrans.getSommet(1), 
            LignePolyTrans.getSommet(2));
        return triangleTrans;
    }

    public double getSurface(){
        // on utilise la formule de l'énoncé.
        double a = sommets[0].distanceA(sommets[1]);
        double b = sommets[1].distanceA(sommets[2]);
        double c = sommets[2].distanceA(sommets[3]);
        double p = (double) (a+b+c)/2;
        double aire = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return aire;
    }
}
