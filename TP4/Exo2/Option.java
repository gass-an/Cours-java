package TP4.Exo2;

public class Option {
    private int numero;
    private String libelle;
    private double prix;

    public Option(int numero, String libelle, double prix){
        this.numero = numero;
        this.libelle = libelle;
        this.prix = prix;
    }

    public int getNumero() {
        return numero;
    }
    public String getLibelle() {
        return libelle;
    }
    public double getPrix() {
        return prix;
    }

    public String toString() {
        return String.format("Option n°%d\nLibelle : %s\nPrix : %d", numero, libelle, prix);
    }
}
