package TP5.personnages;

import TP5.Personnage;

public class Humain extends Personnage{
    public Humain(String n, int x, int y){
        super(n, x, y);
        this.v = 5;
    }

    public String parler() {
        return "Bonjour";
    }
}
