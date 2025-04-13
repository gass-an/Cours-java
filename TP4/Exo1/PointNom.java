package TP4.Exo1;

public class PointNom extends Point {
    private char nom;
    
    PointNom(double x, double y, char nom){
        super(x, y);
        this.nom = nom;
    }

    public String toString() {
        String coordonnees = super.toString();
        String str = nom + coordonnees;
        System.out.println(str);
        return str;
    }

    public boolean equals(PointNom p){
        boolean coordAreEquals = this.equals(p);
        boolean nameAreEquals = this.getNom() == p.getNom();
        return coordAreEquals && nameAreEquals;
    }

    public char getNom() {
        return nom;
    }
}
