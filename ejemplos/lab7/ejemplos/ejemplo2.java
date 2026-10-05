// base ^ exponente
// 2 ^ 0 = 1
// 2 ^ 1 = 2
// 2 ^ 2 = 2 * 2
// 2 ^ 3 = 2 * 2 * 2
// 2 ^ 4 = 2 * 2 * 2 * 2

// Caso base
// potencia(base, exponente) = 1 // exponente = 0

// Caso recursivo
// potencia(base, exponente) = base * potencia(base, exponente-1)  // exponente > 0

// potencia(2, 0) = 1
// potencia(2, 1) = 2 * potencia(2, 0) = 2 * 1 = 2
// potencia(2, 2) = 2 * potencia(2, 1) = 2 * 2 = 4
// potencia(2, 3) = 2 * potencia(2, 2) = 2 * 4 = 8
// potencia(2, 4) = 2 * potencia(2, 3) = 2 * 8 = 16

package ejemplos;

public class ejemplo2 {
    static long potencia(long base, int exponente) {
        // Caso base
        if(exponente == 0){
            return 1; // exponente = 0
        }
        // Caso recursivo
        return base * potencia(base, exponente-1); // exponente > 0
    }

    public static void main(String[] args) {
        System.out.print("2 ^ 4 = " + potencia(2, 4));
    }
}
