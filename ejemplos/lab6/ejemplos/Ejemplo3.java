import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejemplo3 {
    public static void main(String[] args) {
        Set<String> unicas = new HashSet<>();

        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese varias palabras separadas por espacios: ");
            String linea = sc.nextLine();

            String[] palabras = linea.trim().split("\\s+");

            for(String palabra : palabras) {
                if(!palabra.isBlank()) {
                    unicas.add(palabra.toLowerCase());
                }
            }
        }

        System.out.println();
        System.out.println("Palabras únicas (" + unicas.size() + "): " + unicas);
    }
}
