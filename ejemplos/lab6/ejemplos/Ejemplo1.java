import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese 5 numeros enteros: ");
            for(int i=0; i<5; i++) {
                System.out.print("Numero de indice ("+ i + "): ");
                numeros.add(sc.nextInt());
            }
        }

        int suma = 0;
        for(int n : numeros) {
            suma += n;
        }

        double promedio = (double) suma / numeros.size();

        System.out.println();
        System.out.println("Lista: " + numeros);
        System.out.println("Suma: " + suma);
        System.out.printf("Promedio: %.2f%n", promedio);
    }
}
