import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine().trim();

        // Normalizamos a minusculas
        String normalizada = palabra.toLowerCase();

        // Obtenemos la reversa de la cadena
        String invertida = new StringBuilder(normalizada).reverse().toString();

        if(normalizada.equals(invertida)) {
            System.out.println(palabra + " es un palindromo");
        } else {
            System.out.println(palabra + " NO es un palindromo");
        }
        sc.close();
    }
}
