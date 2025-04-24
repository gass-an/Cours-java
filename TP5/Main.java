package TP5;

import TP5.anneaux.AnneauSoron;
import TP5.personnages.Hobbit;

public class Main {
    public static void main(String[] args) {
        Personnage frodon = new Hobbit("Froddon", 200, 100);
        Anneau soron = new AnneauSoron();
        soron.setPorteur(frodon);
    }
}
