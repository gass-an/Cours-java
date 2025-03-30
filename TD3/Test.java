package TD3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Ville ville1 = new Ville();
        System.out.println(ville1.toString());

        Ville ville2 = new Ville("nouméa", 499999);
        System.out.println(ville2.toString());

        Ville ville3 = new Capitale("païta","Nlle Calédonie",1000000);
        System.out.println(ville3.toString());

        ArrayList<Ville> tableau = new ArrayList<Ville>();
        tableau.add(ville1);
        tableau.add(ville2);
        tableau.add(ville3);
        
        for (Ville ville : tableau){
            System.out.println(ville.categorie());
        } 
    }
}
