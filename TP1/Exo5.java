package TP1;
public class Exo5 {
    int dim;
    int[][] matrice;

    Exo5(int dim){
        matrice = new int[dim][dim];
        this.dim = dim;
    }

    public void remplir(){
        for (int i=0; i < dim; i++){
            for (int j=0; j < dim; j++){
                int rand = (int)(Math.random() * 9) + 1;
                matrice[i][j] = rand; 
            }
        }
    }
    
    public void afficher(){
        System.out.println("Ma matrice: ");
        for (int i=0; i < dim; i++){
            for (int j=0; j < dim; j++){
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static Exo5 addition(Exo5 matrice1, Exo5 matrice2){
        System.out.println("\nAddition  : ");
        Exo5 res = new Exo5(matrice1.dim);
        for (int i=0; i < matrice1.dim; i++){
            for (int j=0; j < matrice1.dim; j++){
                res.matrice[i][j] = matrice1.matrice[i][j] + matrice2.matrice[i][j];
            }
        }
        return res;
    }


    public static Exo5 multiplication(Exo5 matrice1, Exo5 matrice2){ // fonctionne que pour des matrices carrées d'entier.
        System.out.println("\nMultiplication: ");
        Exo5 res = new Exo5(matrice1.dim);
        for (int i = 0; i < matrice1.dim; i++){
            for (int j = 0; j < matrice1.dim; j++){
                res.matrice[i][j] = 0;
                for (int k=0; k < matrice1.dim; k++){
                    res.matrice[i][j] += matrice1.matrice[i][k] * matrice2.matrice[k][j];
                }
            }
        }
        return res;
    }

    public static Exo5 transposee(Exo5 matrice1){
        System.out.println("\nTransposée: ");
        Exo5 res = new Exo5(matrice1.dim);
        for (int i=0; i < matrice1.dim; i++){
            for (int j=0; j < matrice1.dim; j++){
                res.matrice[i][j] = matrice1.matrice[j][i];
            }
        }
        return res;
    }



    public static void main(String[] args){
        Exo5 test = new Exo5(3);
        Exo5 test2 = new Exo5(3);
        Exo5 resAdd = new Exo5(3);
        Exo5 resMult = new Exo5(3);
        Exo5 transpo = new Exo5(3);

        test.remplir();
        test2.remplir();
        test.afficher();
        test2.afficher();
        resAdd = Exo5.addition(test,test2);
        resAdd.afficher();
        resMult = Exo5.multiplication(test,test2);
        resMult.afficher();
        transpo = Exo5.transposee(test);
        transpo.afficher();
    }
}
