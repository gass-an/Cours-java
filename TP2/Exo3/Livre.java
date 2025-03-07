package TP2.Exo3;

public class Livre {
    private String titre;
    private String nomAuteur;
    private String prenomAuteur;
    private String categorie;
    private String isbn;
    private String code;

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
