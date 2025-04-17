package TP5.personnages;

import TP5.Personnage;
import TP5.interfaces.Guerrier;

public class NainGuerrier extends Nain implements Guerrier{
    private int force;
    
    public NainGuerrier(String n, int x, int y, int v, int force){
        super(n, x, y, v);
        this.force = force;
    }

    @Override
    public void attaquer(Personnage cible) {
        int degats = this.getForce();
        int vieAdversaire = cible.getPointsVie();
        if (degats > vieAdversaire){
            cible.setPointsVie(0);
        }
        else {
            cible.setPointsVie(vieAdversaire - degats);
        }
    }

    @Override
    public int getForce() {
        return force;
    }
}
