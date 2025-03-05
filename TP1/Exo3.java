package TP1;
public class Exo3 {
    private int[] tableau = new int[] {2,5,1,4,6,4,1,1,1};

    public void afficher(){
        System.out.print("[ ");
        for (int i = 0; i < tableau.length; i++){
            System.out.print(tableau[i]);
            if (i == tableau.length -1 ){
                System.out.print("");
            }
            else {System.out.print(", ");}
        }
        System.out.println(" ]");
    }

    public int sum(){
        int somme = 0;
        for (int i = 0; i < tableau.length; i++){
            somme += tableau[i];
        }
        System.out.println("Somme = " + somme);
        return somme;
    }

    public double average(){
        int somme = sum();
        double moyenne = ((double) somme)/tableau.length;
        System.out.println("Moyenne = " + moyenne);
        return moyenne;
    }

    public double ecartType(){
        double ecart = 0;
        double moyenne = average();
        for (int i = 0; i < tableau.length; i++){
            double temp = ((double) tableau[i] - moyenne);
            ecart += Math.pow(temp,2);
        }
        ecart = Math.sqrt((double) 1/tableau.length * ecart);
        System.out.println("Ecart Type = " + ecart);
        return ecart;
    }

    public int minimum(){
        int min = tableau[0];
        for (int i = 0; i < tableau.length; i++){
            if (tableau[i] < min){
                min = tableau[i];
            }
        }
        System.out.println("Minimum = " + min);
        return min;
    }

    public int maximum(){
        int max = tableau[0];
        for (int i = 0; i < tableau.length; i++){
            if (tableau[i] > max){
                max = tableau[i];
            }
        }
        System.out.print("Maximum = ");
        System.out.println(max);
        return max;
    }

    public void position(int number){
        String res = new String("");
        for (int i = 0; i < tableau.length; i++){
            if (tableau[i] == number){
                res = String.format("%s %d", res, i);
            }
        }
        System.out.println(String.format("Position de %d :%s", number, res));
    }

    public void distribution(){
        int min = minimum();
        int max = maximum();
        String res = new String("Distribution des valeurs :\n");
        for (int j = min; j <= max; j++){
            int count = 0;
            for (int i = 0; i < tableau.length; i++){
                if (j == tableau[i]){
                    count += 1; 
                }
            }
            res = String.format("%s%d : %d\n", res, j, count);
        }
        System.out.println(res);
    }

    public void diagramme(){
        int min = minimum();
        int max = maximum();
        String res = new String("Distribution des valeurs en bâton :\n");
        for (int j = min; j <= max; j++){
            res = String.format("%s%d : ", res, j);
            for (int i = 0; i < tableau.length; i++){
                if (j == tableau[i]){
                    res = String.format("%s*", res); 
                }
            }
            res = String.format("%s\n", res);
        }
        System.out.println(res);
    }


    public static void main(String[] args){
        Exo3 test = new Exo3();
        test.afficher();
        // test.sum();
        // test.average();  // appel sum()
        test.ecartType();   // appel average()
        test.minimum();
        test.maximum();
        test.position(1);
        test.distribution();
        test.diagramme();
    }
}
