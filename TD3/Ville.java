package TD3;

public class Ville {
    private String nom;
    private int nbHab;
    private char categorie;

    Ville(){
        this.nom = "default";
    }

    Ville(String nom){
        this.nom = nom.toUpperCase();
        this.nbHab = 0;
    }

    Ville(String nom, int nbHab){
        this(nom);
        this.nbHab = (nbHab > 0) ? nbHab : 0; 
    }


    public void changementHab(int nbHab){
        this.nbHab = (nbHab > 0) ? nbHab : 0;
    }

    public char categorie(){
        if (nbHab == 0){
            categorie = '?';
        }
        else if (nbHab < 500000){
            categorie = 'A';
        }
        else {
            categorie = 'B';
        }
        return categorie;
    }

    public String toString(){
        String res = new String();
        res = String.format("Nom de ville : %s (%d habitants)", nom, nbHab);
        return res;
    }

    public int getNbHab() {
        return nbHab;
    }
    public String getNom() {
        return nom;
    }
    public char getCategorie() {
        return categorie;
    }
    public void setCategorie(char categorie) {
        this.categorie = categorie;
    }
}
