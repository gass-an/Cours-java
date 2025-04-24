package TP5.personnages;

import TP5.Personnage;

public class Hobbit extends Personnage {
    public Hobbit(String n, int x, int y) {
        super(n, x, y);
        this.v = 5;
    }


    public String parler() {
        return "Belle journée ma foi";
    }
}
