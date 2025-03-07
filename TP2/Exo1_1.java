package TP2;
import java.util.Scanner;
public class Exo1_1{

    public static void main(String[] args) {
        System.out.print("Entrer une phrase : ");
        Scanner userSentence = new Scanner(System.in); // input
        
        String sentence = userSentence.nextLine();  // lecture de l'input + conversion en String
        userSentence.close();
        
        char[] sentenceArray = sentence.toCharArray();
        int count = 0;
        for (int i=0; i<sentenceArray.length; i++){
            if (sentenceArray[i] == 'a'){
                count += 1;
                sentenceArray[i] = '*';
            }
        }
        String newSentence = String.valueOf(sentenceArray);
        
        System.out.println("Votre phrase: " + sentence); 
        System.out.println("Votre phrase en majuscule: " + sentence.toUpperCase()); 
        System.out.println(String.format("%d 'a' remplacés par '*' : %s",count, newSentence)); 
      }
}