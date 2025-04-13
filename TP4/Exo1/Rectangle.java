package TP4.Exo1;

public class Rectangle implements Forme {
    private LignePolygonale lignePoly;
    private Point[] sommets;
    
    public Rectangle(Point p1, Point p3){
        Point p2 = new Point(p3.getX(),p1.getY());
        Point p4 = new Point(p1.getX(),p3.getY());

        sommets = new Point[] {p1,p2,p3,p4,p1};
        lignePoly = new LignePolygonale(sommets);
    }
    
    public double getPerimetre(){
        return lignePoly.longueur();
    }

    public Forme translater(double dx, double dy){
        LignePolygonale LignePolyTrans = lignePoly;
        LignePolyTrans.translater(dx,dy);
        Rectangle rectangleTrans = new Rectangle(
            LignePolyTrans.getSommet(0),  
            LignePolyTrans.getSommet(2));
        return rectangleTrans;
    }

    public double getSurface(){
        double a = sommets[0].distanceA(sommets[1]);
        double b = sommets[1].distanceA(sommets[2]);
        double aire = a*b;
        return aire;
    }
}
 