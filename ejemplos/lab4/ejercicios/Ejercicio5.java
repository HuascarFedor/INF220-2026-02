// Encontrar el mayor y el menor de tres números

public class Ejercicio5 {
    public static int mayorDeTres(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }    

    public static int menorDeTres(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        int a = 12, b = 45, c = 7;
        System.out.printf("Numeros: %d, %d, %d%n", a, b, c);
        System.out.printf("Mayor = %d%n", mayorDeTres(a, b, c));
        System.out.printf("Menor = %d%n", menorDeTres(a, b, c));
    }
}
