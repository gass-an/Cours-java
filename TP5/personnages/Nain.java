package TP5.personnages;

import TP5.Personnage;

public class Nain extends Personnage{
    public Nain(String n, int x, int y){
        super(n, x, y);
        this.v = 2;
    }

    public String parler() {
        return "Groumpf";
    }
}
