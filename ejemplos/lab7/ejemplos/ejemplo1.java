// La factorial
// factorial(1) = 1 
// factorial(2) = 2 * 1
// factorial(3) = 3 * 2 * 1
// factorial(4) = 4 * 3 * 2 * 1
// factorial(5) = 5 * 4 * 3 * 2 * 1

// factorial(1) = 1 
// factorial(2) = 2 * factorial(1)
// factorial(3) = 3 * factorial(2)
// factorial(4) = 4 * factorial(3)
// factorial(5) = 5 * factorial(4)

// Caso base
// factorial(1) = 1  // n <= 1

// Caso recursivo
// factorial(n) = n * factorial(n-1) // n>1

package ejemplos;

public class ejemplo1 {
    static long factorial_iterativo(int n) {
        long prod = 1;
        for(int i = n; i>1; i--) {
            prod *= i;
        }
        return prod;
    }
    static long factorial(int n) {
        if(n <= 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
    static long factorial_detalle(int n, int nivel) {
        if(n < 0) {
            throw new IllegalArgumentException("n debe ser >= 0");
        }
        String sangria = "  ".repeat(nivel);
        System.out.println(sangria + "->factorial(" + n + ")");
        if(n <=1 ) {
            System.out.println(sangria + "<- devuelve 1");
            return 1;
        }
        long resultado = n * factorial_detalle(n-1, nivel+1);
        System.out.println(sangria + "<- devuelve " + resultado);
        return resultado;
    }
    public static void main(String[] args) {
        //System.out.println("4! = " + factorial(4));
        //System.out.println("4! = " + factorial_iterativo(4));

        System.out.println("4! = " + factorial_detalle(4,0));
    }
}

// factorial(4) = 4 * factorial(3) = 4 * 6 = 24
// factorial(3) = 3 * factorial(2) = 3 * 2 = 6 
// factorial(2) = 2 * factorial(1) = 2 * 1 = 2
// factorial(1) = 1