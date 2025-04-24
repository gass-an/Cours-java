package TD4;

import java.util.Scanner;

public class MyMath {
    //EXO 1 : lenght-1 pour patch l'erreur
    //EXO 2 : 

    public static double[] solveEquation(double A, double B, double C)
      throws IllegalArgumentException {
        if (A == 0)
            throw new IllegalArgumentException("Le coefficient A doit être non nul");
            double disc = B*B - 4*A*C;
        if (disc < 0)
            throw new IllegalArgumentException("Discriminant négatif : pas de racines réelles");
            double root = Math.sqrt(disc);
            double sol1 = (-B + root) / (2*A);
            double sol2 = (-B - root) / (2*A);
            return new double[]{sol1, sol2};
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rep;
        do {
            try {
                System.out.print("A = "); double A = sc.nextDouble();
                System.out.print("B = "); double B = sc.nextDouble();
                System.out.print("C = "); double C = sc.nextDouble();
                double[] sol = solveEquation(A, B, C);
                System.out.printf("Solutions : %.2f et %.2f%n", sol[0], sol[1]);
            } catch (IllegalArgumentException e) {
                System.err.println("Erreur : " + e.getMessage());
            }
            System.out.print("Recommencer ? (o/n) "); rep = sc.next();
        } while (rep.equalsIgnoreCase("o"));
        sc.close();
    }
}
