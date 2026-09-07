/*
    Ejercicio 3: Dado un nombre completo como "Juan Mamani Lopez", 
    genere sus iniciales en el formato "J.M.L.".
*/

import java.util.Scanner;

public class Iniciales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre completo: ");
        String nombre = sc.nextLine().trim();

        String[] partes = nombre.split("\\s+");

        StringBuilder iniciales = new StringBuilder();
        for(String parte: partes) {
            if(!parte.isEmpty()) {
                char inicial = Character.toUpperCase(parte.charAt(0));
                iniciales.append(inicial).append(".");
            }
        }

        System.out.println("Iniciales: " + iniciales);

        sc.close();
    }
}
