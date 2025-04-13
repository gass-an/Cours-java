package TP4.Exo2;

public class Occasion extends Voiture {
    private int nbKms;
    private int age;

    public Occasion(String numero, double prix, int nbKms, int age){
        super(numero, prix);
        this.nbKms = nbKms;
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }

    public int getNbKms() {
        return nbKms;
    }

    public double getPrix() {
        double difference = 20000*age - nbKms;
        return super.prix + difference*6;
    }
    public String toString() {
        return super.toString() + String.format("\nKms : %d\nAge: %d", nbKms, age);
    }
}
