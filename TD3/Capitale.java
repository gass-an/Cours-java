package TD3;

public class Capitale extends Ville {
    private String pays;

    Capitale(){
        super();
        this.pays = "Pays default";
    }

    Capitale(String nom, String pays){
        super(nom);
        this.pays = pays.toUpperCase();
    }
    
    Capitale(String nom, String pays, int nbHab){
        super(nom, nbHab);
        this.pays = pays.toUpperCase();
    }

    public char categorie(){
        setCategorie('C');
        return getCategorie();
    }

    public boolean categorie(int nombreHab, int imprecision){
        if (nombreHab < getNbHab() + imprecision && nombreHab > getNbHab() - imprecision) {
            return true;
        }
        return false;
    }

    public String toString(){
        String res = new String();
        res = String.format("%s, capitale de %s (%d habitants)", getNom(), pays, getNbHab());
        return res;
    }
    public String getPays() {
        return pays;
    }
}
