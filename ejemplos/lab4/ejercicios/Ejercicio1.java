// Determinar si un número es primo, y revisar cuales son primos
// del 1 al 30

public class Ejercicio1 {
    public static boolean esPrimo(int n) {
        if(n < 2 ) {
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }    

    public static void main(String[] args) {
        System.out.println("Numeros primos del 1 al 30");
        for(int n = 1; n<=30; n++) {
            System.out.printf("%2d -> %s%n", n, esPrimo(n) ? "primo" : "no primo");
        }
    }
}