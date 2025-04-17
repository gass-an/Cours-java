package TP5.personnages;

import TP5.Personnage;

public class Nain extends Personnage{
    public Nain(String n, int x, int y, int v){
        super(n, x, y, v);
        this.v = 2;
    }

    public String parler() {
        return "Groumpf";
    }
}
