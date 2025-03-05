package TP1;
public class Exo4 {
    private char[] brinPrinc = new char[6];
    private char[] brinDup = new char[brinPrinc.length];
    private char[] brinAlea = new char[brinPrinc.length];
    private char[] brinComp = new char[brinAlea.length];


    Exo4(){
        for (int i = 0; i < 6; i++){
            int rand = (int)(Math.random() * 4) + 1;
            switch(rand){
                case 1: 
                    brinPrinc[i] = 'A';
                    break;
                case 2: 
                    brinPrinc[i] = 'C';
                    break;
                case 3: 
                    brinPrinc[i] = 'G';
                    break;
                case 4: 
                    brinPrinc[i] = 'T';
                    break;
            }
        }
        System.out.print("Brin pricipal généré aléatoirement : ");
        
        afficher();
        System.out.println("");
    }

    public void afficher(){
        for (int i = 0; i < brinPrinc.length; i++){
            System.out.print(brinPrinc[i]);
        }
    }

    public void dupli(){
        System.out.print("Brin dupliqué                      : ");
        for (int i = 0; i < brinPrinc.length; i++){
            switch(brinPrinc[i]){
                case 'A': 
                    brinDup[i] = 'T';
                    break;
                case 'C': 
                    brinDup[i] = 'G';
                    break;
                case 'G': 
                    brinDup[i] = 'C';
                    break;
                case 'T': 
                    brinDup[i] = 'A';
                    break;
            }
            System.out.print(brinDup[i]);
        }
        System.out.println("");
    }

    public void alea(){
        System.out.print("Brin aléatoire de même taille      : ");
        for (int i = 0; i < brinPrinc.length; i++){
            int rand = (int)(Math.random() * 4) + 1;
            switch(rand){
                case 1: 
                    brinAlea[i] = 'A';
                    break;
                case 2: 
                    brinAlea[i] = 'C';
                    break;
                case 3: 
                    brinAlea[i] = 'G';
                    break;
                case 4: 
                    brinAlea[i] = 'T';
                    break;
            }
            System.out.print(brinAlea[i]);
        }
        System.out.println("");
    }

    public void mutation(){
        int randPos = (int)(Math.random() * brinPrinc.length);
        int randNucleo = (int)(Math.random() * 4) + 1;
        switch(randNucleo){
            case 1: 
                if(brinPrinc[randPos] == 'A'){
                    mutation();
                    return;
                }
                brinPrinc[randPos] = 'A';
                break;
            case 2: 
                if(brinPrinc[randPos] == 'C'){
                    mutation();
                    return;
                }
                brinPrinc[randPos] = 'C';
                break;
            case 3: 
                if(brinPrinc[randPos] == 'G'){
                    mutation();
                    return;
                }
                brinPrinc[randPos] = 'G';
                break;
            case 4: 
                if(brinPrinc[randPos] == 'T'){
                    mutation();
                    return;
                }
                brinPrinc[randPos] = 'T';
                break;
        }
        System.out.print("Brin pricipal mutation aléatoire   : ");
        afficher();
        System.out.println("");
    }

    public void recombinaison(){ // début aléa + fin principal
        System.out.print("Brin recombiné aléa + principal    : ");
        int randPos = (int)(Math.random() * brinPrinc.length - 1) + 1;
        for (int i=0; i < randPos; i++){
            System.out.print(brinAlea[i]);
        }
        for (int i=0; i < brinAlea.length - randPos; i++){
            System.out.print(brinPrinc[i]);
        }
        System.out.println(String.format("   Position recombinaison : %d", randPos));
    }

    public void complement(){
        System.out.print("Brin complément du brin aléatoire  : ");
        for (int i = 0; i < brinAlea.length; i++){
            brinComp[i] = brinAlea[brinAlea.length-1 - i ];
            System.out.print(brinComp[i]);
        }
        System.out.println("");
    }

    public void cloneMultiple(){
        System.out.print("Brin principal cloné               : ");
        int rand = (int)(Math.random() * 10) + 1;
        for (int i=0; i<rand; i++ ){
            afficher();
        }
        System.out.println(String.format("   Nombre de clone : %d", rand));
    }


    public static void main(String[] args){
        Exo4 test = new Exo4();
        test.dupli();
        test.alea();
        test.mutation();
        test.recombinaison();
        test.complement();
        test.cloneMultiple();
    }
}


