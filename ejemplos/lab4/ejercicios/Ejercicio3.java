// Calcular la factorial de n!; probarlo con un numero ingresado desde teclado
import java.util.Scanner;
public class Ejercicio3 { 
    public static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = teclado.nextInt();
        if(n < 0)
            System.out.println("El factorial no esta definido para numeros negativos.");
        else    
            System.out.println("El factorial de " + n + " es: " + factorial(n));
    }
}
