package TP2.Exo3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bibliotheque {
    private static List<Livre> livreList = new ArrayList<Livre>();
    
    public void ajouterUnLivre(Scanner userInput) {
        Livre livrePoche = new Livre();
        
        System.out.print("Entrer le titre : ");
        String input = userInput.nextLine();
        livrePoche.setTitre(input);

        System.out.print("Entrer le Nom de l'auteur : ");
        input = userInput.nextLine();
        livrePoche.setNomAuteur(input);

        System.out.print("Entrer le Prénom de l'auteur : ");
        input = userInput.nextLine();
        livrePoche.setPrenomAuteur(input);

        System.out.print("Entrer la Catégorie : ");
        input = userInput.nextLine();
        livrePoche.setCategorie(input);

        System.out.print("Entrer le numéro ISBN : ");
        input = userInput.nextLine();
        livrePoche.setIsbn(input);

        livreList.add(livrePoche);
    }
    
    public static void main(String[] args){
        Bibliotheque test = new Bibliotheque();
        
        Scanner userInput = new Scanner(System.in); 
        test.ajouterUnLivre(userInput);
        test.ajouterUnLivre(userInput);
        userInput.close();

        System.out.println("");
        livreList.get(livreList.size()-1).afficherUnLivre(); // affiche le dernier livre de la liste des livres
    }
}
