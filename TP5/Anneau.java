package TP5;

public class Anneau {
    private String nom;
    private String pouvoir;
    private Boolean powerIsActivated;
    private Personnage porteur;

    public Anneau(String nom, String pouvoir) {
        this.nom = nom;
        this.pouvoir = pouvoir;
        this.porteur = null;
        this.powerIsActivated = false; 
    }

    public void mettre(){
        setPowerIsActivated(true);
    }
    public void enlever(){
        setPowerIsActivated(false);
    }

    public String getNom() {
        return nom;
    }
    public String getPouvoir() {
        return pouvoir;
    }
    public Boolean getPowerIsActivated() {
        return powerIsActivated;
    }
    public Personnage getPorteur() {
        return porteur;
    }
    public void setPorteur(Personnage porteur) {
        this.porteur = porteur;
    }
    public void setPowerIsActivated(Boolean powerIsActivated) {
        this.powerIsActivated = powerIsActivated;
    }
}
