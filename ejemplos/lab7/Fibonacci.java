// 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
// fib(0) = 0
// fib(1) = 1
// fib(2) = fib(1) + fib(0) = 1 + 0 = 1
// fib(3) = fib(2) + fib(1) = 1 + 1 = 2
// fib(4) = fib(3) + fib(2) = 2 + 1 = 3
// fib(5) = fib(4) + fib(3) = 3 + 2 = 5
// fib(6) = fib(5) + fib(4) = 5 + 3 = 8
// fib(7) = fib(6) + fib(5) = 8 + 5 = 13

// Caso base
// fibonacci(n) = 0 // n = 0
// fibonacci(n) = 1 // n = 1

// Caso recursivo
// fibonacci(n) = fibonacci(n-1) + fibonacci(n-2) // n > 1


public class Fibonacci {

    private static long llamadas;

    public static long fibonacci(int n) {
        llamadas++;
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }

    public static long fibonacciMemo(int n, long[] memo) {
        llamadas++;
        if(n <= 1) return n;
        if(memo[n] != 0) return memo[n];
        memo[n] = fibonacciMemo(n - 1, memo) + fibonacciMemo(n - 2, memo);
        return memo[n];
    }

    // Traza: muestra el arbol de llamadas con sangria
    public static long fibonacciTraza(int n, int nivel) {
        llamadas++;
        System.out.println(" ".repeat(nivel) + "fib(" + n + ")");
        if(n <= 1) return n;
        return fibonacciTraza(n - 1, nivel + 1) + fibonacciTraza(n - 2, nivel + 1);
    }

    public static void main(String[] args) {
        System.out.println("Árbol de llamadas para fib(4): ");
        llamadas = 0;
        long r = fibonacciTraza(4, 0);
        System.out.println("Resultado: " + r + " Cantidad de llamadas: " + llamadas);
        System.out.println();

        System.out.println("Serie de Fobonacci n = 0 hasta n = 10 ");
        for(int i = 0; i<=10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println("\nCantidad de llamadas: " + llamadas);
        System.out.println();

        System.out.printf("%-4s %-12s %-18s %-16s%n",
            "n", "fib(n)", "llamadas directa", "llamadas memo");
        int[] valores = {10, 20 , 30, 40};
        for(int n: valores){
            llamadas = 0;
            long resultado = fibonacci(n);
            long directa = llamadas;

            llamadas = 0;
            fibonacciMemo(n, new long[n+1]);
            long memo = llamadas;

            System.out.printf("%-4d %-12d %-18d %-16d%n", n, resultado, directa, memo);
        }

    }
}
