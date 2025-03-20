package TP3.gestionEtudiants;

import java.util.ArrayList;

public class GroupeEtudiants {
    private ArrayList<Etudiant> listeEtudiants = new ArrayList<Etudiant>();
    
    public int nombre() {
        return listeEtudiants.size();
    }

    public ArrayList<Etudiant> getListe() {
        return listeEtudiants;
    }

    public void ajouterEtudiant(Etudiant etudiant){
        listeEtudiants.add(etudiant);
    }

    public Etudiant chercher(String nom){
        for (Etudiant etudiant : listeEtudiants){
            String name = etudiant.getNom();
            if (name.equals(nom)){
                System.out.println(etudiant);
                return etudiant;
            }
        }
        System.out.println("null");
        return null;
    }

    public void lister(){
        for (Etudiant etudiant : listeEtudiants){
            System.out.println(etudiant);
        }
    }

    public static void main(String[] args){
        Etudiant etudiant = new Etudiant("Pierre");
        etudiant.ajouterNote(-2);
        etudiant.ajouterNote(10);
        etudiant.ajouterNote(25);
        Etudiant etudiant2 = new Etudiant("Paul");
        etudiant2.ajouterNote(12);
        etudiant2.ajouterNote(10);
        etudiant2.ajouterNote(15);
        Etudiant etudiant3 = new Etudiant("Jacques");
        etudiant3.ajouterNote(10);
        etudiant3.ajouterNote(12);
        etudiant3.ajouterNote(14);

        GroupeEtudiants grp = new GroupeEtudiants();
        grp.ajouterEtudiant(etudiant);
        grp.ajouterEtudiant(etudiant2);
        grp.ajouterEtudiant(etudiant3);

        // grp.chercher("Pierre");
        // grp.chercher("Jean");

        grp.lister();
    }
}
