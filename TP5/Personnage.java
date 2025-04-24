package TP5;

import java.util.HashMap;

public abstract class Personnage{
    protected String nom;
    protected int pointsVie, connaissances, x, y, v, sous;
    protected HashMap<String, Anneau> anneaux = new HashMap<String, Anneau>();
    
    public Personnage(String n, int x, int y){
        this.nom = n;
        this.x = x; this.y = y;
        this.pointsVie = 100;
        this.connaissances = 0;
        this.v = 0;
        this.sous = 0;
    }
    
    public int getSous(){
        return this.sous;
    }
    public void setSous(int s){
        this.sous = s;
    }
    public int getPointsVie(){
        return this.pointsVie;
    }
    public void setPointsVie(int pv){
        this.pointsVie = pv;
    }
    public int getConnaissances(){
        return this.connaissances;
    }
    public void setConnaissances(int co){
        this.connaissances = co;
    }
    public void seDeplacer(int dx, int dy, int t){
        this.x = (int) (this.x + dx*this.v*t/Math.sqrt(dx*dx+dy*dy));
        this.y = (int) (this.y + dy*this.v*t/Math.sqrt(dx*dx+dy*dy));
    }

    public abstract String parler();

    public void newAnneau(Anneau a){
        anneaux.put(a.getNom(), a);
    }
}