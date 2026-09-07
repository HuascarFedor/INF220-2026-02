/*
    Ejercicio 4: Invertir el orden de las palabras de una frase.
*/

import java.util.Scanner;

public class InvertirPalabra { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine().trim();

        // Separar la frase en palabras
        String[] palabras = frase.split("\\s+");

        // Recorrer el arreglo desde el final hasta el inicio
        StringBuilder invertida = new StringBuilder();
        for(int i = palabras.length - 1; i >= 0; i--) {
            invertida.append(palabras[i]);
            if(i > 0) {
                invertida.append(" ");
            }
        }

        System.out.println("Frase invertida: " + invertida);

        sc.close();
    }
}