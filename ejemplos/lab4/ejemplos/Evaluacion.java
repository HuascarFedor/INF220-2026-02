import java.util.Scanner;

public class Evaluacion {
    public static double promedio(double[] n){
        double s = 0;
        for(double x: n) s+=x;
        return s / n.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        for(int i=0; i<5; i++) {
            System.out.print("Nota " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
        }
        double p = promedio(notas);
        System.out.println("Promedio " + p);
        sc.close();
    }
}
