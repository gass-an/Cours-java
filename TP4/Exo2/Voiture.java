package TP4.Exo2;

abstract class Voiture {
    private String numero;
    protected double prix;

    public Voiture(String numero, double prix){
        this.numero = numero;
        this.prix = prix;
    }
    
    public String getNumero() {
        return numero;
    }

    abstract  double getPrix();

    public String toString() {
        return String.format("Voiture n°%d\nPrix : %d", numero, prix);
    }
}
