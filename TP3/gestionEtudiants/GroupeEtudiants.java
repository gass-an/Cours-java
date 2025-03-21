package TP3.gestionEtudiants;

import java.util.ArrayList;

/**
 * Classe représentant un groupe d'étudiants.
 * Permet d'ajouter, de rechercher et de lister les étudiants du groupe.
 */
public class GroupeEtudiants {
    private ArrayList<Etudiant> listeEtudiants = new ArrayList<Etudiant>();

    /**
     * Retourne le nombre d'étudiants dans le groupe.
     * 
     * @return Le nombre d'étudiants.
     */
    public int nombre() {
        return listeEtudiants.size();
    }

    /**
     * Retourne la liste des étudiants du groupe.
     * 
     * @return Une liste d'objets {@link Etudiant}.
     */
    public ArrayList<Etudiant> getListe() {
        return listeEtudiants;
    }

    /**
     * Ajoute un étudiant au groupe.
     * 
     * @param etudiant L'étudiant à ajouter.
     */
    public void ajouterEtudiant(Etudiant etudiant) {
        listeEtudiants.add(etudiant);
    }

    /**
     * Recherche un étudiant par son nom dans le groupe.
     * 
     * @param nom Le nom de l'étudiant à rechercher.
     * @return L'étudiant trouvé ou {@code null} si aucun étudiant ne correspond.
     */
    public Etudiant chercher(String nom) {
        for (Etudiant etudiant : listeEtudiants) {
            String name = etudiant.getNom();
            if (name.equals(nom)) {
                System.out.println(etudiant);
                return etudiant;
            }
        }
        System.out.println("null");
        return null;
    }

    /**
     * Affiche la liste de tous les étudiants du groupe.
     */
    public void lister() {
        for (Etudiant etudiant : listeEtudiants) {
            System.out.println(etudiant);
        }
    }

    /**
     * Méthode principale pour tester la classe {@code GroupeEtudiants}.
     * 
     * @param args Arguments de la ligne de commande (non utilisés).
     */
    public static void main(String[] args) {
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
