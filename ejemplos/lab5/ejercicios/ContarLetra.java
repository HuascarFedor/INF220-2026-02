/* 
    Ejercicio 2: Conteo de una letra dentro de una frase.
*/

import java.util.Scanner;

public class ContarLetra {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese una frase: ");
    String frase = sc.nextLine();

    System.out.print("Ingrese la letra a buscar: ");
    char letra = sc.nextLine().charAt(0);

    int contador = 0;
    char letraBuscada = Character.toLowerCase(letra);

    // Recorremos la frase caracter por caracter
    for(int i = 0; i < frase.length(); i++) {
        char actual = Character.toLowerCase(frase.charAt(i));
        if(actual == letraBuscada) {
            contador ++;
        }
    }

    System.out.printf("La letra '%c' aparece %d vez(veces) en la frase.%n", letra, contador);

    sc.close();
   }
}
