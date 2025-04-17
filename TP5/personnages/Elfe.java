package TP5.personnages;

import TP5.Personnage;

public class Elfe extends Personnage{
    public Elfe(String n, int x, int y, int v){
        super(n, x, y, v);
        this.v = 7;
    }

    public String parler() {
        return "Eldarie";
    }
}
