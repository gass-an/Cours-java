package TP2.Exo3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bibliotheque {
    private static List<Livre> livreList = new ArrayList<Livre>();
    
    void setCode(Livre livre){  //pas de modificateur → package-private
        String code = 
        livre.getNomAuteur().substring(0,2) + 
        livre.getPrenomAuteur().substring(0,2)+
        livre.getCategorie().substring(0,2)+
        livre.getIsbn().substring(livre.getIsbn().length()-2,livre.getIsbn().length());
        
        livre.setCode(code);
    }

    public void ajouterUnLivre(Scanner userInput) {
        Livre livrePoche = new Livre();
        setCode(livrePoche);
        livreList.add(livrePoche);
    }

    public void ajouterUnLivre(String titre, String nomAuteur,String prenomAuteur,String categorie,String isbn) {
        Livre unPolar = new Livre(titre,nomAuteur,prenomAuteur,categorie,isbn);
        setCode(unPolar);
        livreList.add(unPolar);
    }
    
    public void afficherInfo(Livre livre){
        System.out.println(String.format("Titre : %s",livre.getTitre()));
        System.out.println(String.format("Code  : %s",livre.getCode()));
    }

    public static void main(String[] args){
        Bibliotheque biblio = new Bibliotheque();
        
        // Scanner userInput = new Scanner(System.in); 
        // biblio.ajouterUnLivre(userInput);
        // userInput.close();

        biblio.ajouterUnLivre("Le mystère de la chambre jaune", "Leroux", "Gaston", "Policier", "22 53 005495");

        System.out.println("");
        biblio.afficherInfo(livreList.get(livreList.size()-1));
        //livreList.get(livreList.size()-1).afficherUnLivre(); // affiche le dernier livre de la liste des livres
    }
}
