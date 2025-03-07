package TP2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Exo1_2 {
    
    
    public static void main(String[] args) {

        List<String> strList = new ArrayList<String>();
        Scanner userWord = new Scanner(System.in);
        
        while (true) {
            System.out.print("Entrer un mot ('Fin' pour arreter) : ");
            String mot = userWord.nextLine();
            if (mot.equals("Fin")){
                break;
            }
            else{
                strList.add(mot);
            }
        }
        userWord.close();
        System.out.println(strList);
        Collections.sort(strList); // trie ordre alphabetique
        System.out.println(String.format("premier ordre alphabétique : %s", strList.get(0)));
        System.out.println(String.format("dernier ordre alphabétique : %s", strList.get(strList.size()-1)));
    }
}
