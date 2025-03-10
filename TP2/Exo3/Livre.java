package TP2.Exo3;

import java.util.Scanner;

public class Livre {
    private String titre;
    private String nomAuteur;
    private String prenomAuteur;
    private String categorie;
    private String isbn;
    private String code;

    Livre(){
        Scanner userInput = new Scanner(System.in); 
        
        System.out.print("Entrer le titre : ");
        String input = userInput.nextLine();
        this.setTitre(input);

        System.out.print("Entrer le Nom de l'auteur : ");
        input = userInput.nextLine();
        this.setNomAuteur(input);

        System.out.print("Entrer le Prénom de l'auteur : ");
        input = userInput.nextLine();
        this.setPrenomAuteur(input);

        System.out.print("Entrer la Catégorie : ");
        input = userInput.nextLine();
        this.setCategorie(input);

        System.out.print("Entrer le numéro ISBN : ");
        input = userInput.nextLine();
        this.setIsbn(input);

        userInput.close();
    }

    Livre(String titre,String nomAuteur,String prenomAuteur,String categorie,String isbn){
        this.titre = titre;
        this.nomAuteur = nomAuteur;
        this.prenomAuteur = prenomAuteur;
        this.categorie = categorie;
        this.isbn = isbn;
    }

    public String afficherUnLivre() {
        String str = String.format(
            "Titre : %s\n" +
            "Nom auteur : %s\n" +
            "Prénom auteur : %s\n" +
            "Catégorie : %s\n" +
            "Isbn : %s\n" +
            "Code : %s\n", 
            titre, nomAuteur, prenomAuteur, 
            categorie, isbn, code
            );
        
            System.out.println(str);
        return str;
    }

    // getteur
    public String getTitre() {
        return titre;
    }
    public String getNomAuteur() {
        return nomAuteur;
    }
    public String getPrenomAuteur() {
        return prenomAuteur;
    }
    public String getCategorie() {
        return categorie;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getCode() {
        return code;
    }
    // setteur
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }
    public void setPrenomAuteur(String prenomAuteur) {
        this.prenomAuteur = prenomAuteur;
    }
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setCode(String code) {
        this.code = code;
    }


    public static void main(String[] args){
        Livre test = new Livre();
        test.afficherUnLivre();
    }
}
