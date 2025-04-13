package TP4.Exo2;

public class Neuve extends Voiture {
    
    public Neuve(String numero, double prix){
        super(numero, prix);
    }
    
    public void addOption(Option o){
        super.prix += o.getPrix();
    }

    public double getPrix() {
        return super.prix;
    }

    public String toString() {
        return super.toString();
    }
}
