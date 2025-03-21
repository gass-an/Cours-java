package TP3.gestionEtudiants;

import java.util.ArrayList;

/**
 * Classe représentant un étudiant avec un nom, une liste de notes et une moyenne.
 */
public class Etudiant {
    private String nom;
    private ArrayList<Integer> listeNotes;
    private double moyenne;

    /**
     * Constructeur de la classe {@code Etudiant}.
     * 
     * @param nom Le nom de l'étudiant.
     */
    public Etudiant(String nom) {
        this.nom = nom;
        this.listeNotes = new ArrayList<Integer>();
        this.moyenne = 0;
    }

    /**
     * Calcule et met à jour la moyenne des notes de l'étudiant.
     */
    private void setMoyenne() {
        int sum = 0;
        for (int i : listeNotes) {
            sum += i;
        }
        this.moyenne = (double) sum / listeNotes.size();
    }

    /**
     * Retourne la moyenne des notes de l'étudiant.
     * 
     * @return La moyenne des notes.
     */
    public double getMoyenne() {
        return moyenne;
    }

    /**
     * Retourne le nom de l'étudiant.
     * 
     * @return Le nom de l'étudiant.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourne la liste des notes de l'étudiant.
     * 
     * @return Une liste d'entiers représentant les notes.
     */
    public ArrayList<Integer> getListeNotes() {
        return listeNotes;
    }

    /**
     * Ajoute une note à la liste de l'étudiant.
     * Les notes sont automatiquement ajustées :
     * <ul>
     *     <li>Si la note est négative, elle est remplacée par 0.</li>
     *     <li>Si la note est supérieure à 20, elle est remplacée par 20.</li>
     * </ul>
     * Met également à jour la moyenne.
     * 
     * @param note La note à ajouter.
     */
    public void ajouterNote(int note) {
        if (note < 0) {
            listeNotes.add(0);
        } else if (note > 20) {
            listeNotes.add(20);
        } else {
            listeNotes.add(note);
        }
        setMoyenne();
    }

    /**
     * Retourne une représentation sous forme de chaîne de l'étudiant,
     * affichant son nom et sa moyenne.
     * 
     * @return Une chaîne de caractères représentant l'étudiant.
     */
    public String toString() {
        return String.format("%s  (%.2f)", nom, moyenne);
    }

    /**
     * Méthode principale pour tester la classe {@code Etudiant}.
     * 
     * @param args Arguments de la ligne de commande (non utilisés).
     */
    public static void main(String[] args) {
        Etudiant test = new Etudiant("Paul");
        test.ajouterNote(-2);
        test.ajouterNote(10);
        test.ajouterNote(25);
        System.out.println(test);
    }
}
