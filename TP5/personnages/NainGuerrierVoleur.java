package TP5.personnages;

import TP5.Personnage;
import TP5.interfaces.Voleur;

public class NainGuerrierVoleur extends NainGuerrier implements Voleur{
    private int dexterite;
    public NainGuerrierVoleur(String n, int x, int y, int v, int force, int dexterite){
        super(n, dexterite, y, v, force);
        this.dexterite = dexterite;
    }

    @Override
    public void voler(Personnage cible) {
        int vole = this.getDexterite();
        int sousAdversaire = cible.getSous();
        if (vole > sousAdversaire){
            cible.setSous(0);
            this.setSous(sousAdversaire);
        }
        else {
            cible.setSous(sousAdversaire - vole);
            this.setSous(dexterite);
        }   
    }

    @Override
    public int getDexterite() {
        return dexterite;
    }
}
