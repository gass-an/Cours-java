package TP3.gestionEtudiants;

import java.util.ArrayList;

public class Etudiant {
    private String nom;
    private ArrayList<Integer> listeNotes;
    private double moyenne;

    Etudiant(String nom){
        this.nom = nom;
        this.listeNotes = new ArrayList<Integer>();
        this.moyenne = 0;
    }

    private void setMoyenne() {
        int sum = 0;
        for (int i : listeNotes) {
            sum += i;
        }
        this.moyenne = (double) sum / listeNotes.size();
    }

    public double getMoyenne() {
        return moyenne;
    }
    
    public String getNom() {
        return nom;
    }
    
    public ArrayList<Integer> getListeNotes() {
        return listeNotes;
    }
    
    public void ajouterNote(int note){
        if (note < 0) {listeNotes.add(0);}
        else if (note > 20) {listeNotes.add(20);}
        else {listeNotes.add(note);}
        setMoyenne();
    }

    public String toString() {
        String res = String.format("%s  (%.2f)", nom, moyenne);
        return res;        
    }

    public static void main(String[] args){
        Etudiant test = new Etudiant("Paul");
        test.ajouterNote(-2);
        test.ajouterNote(10);
        test.ajouterNote(25);
        System.out.println(test);
    }

}
