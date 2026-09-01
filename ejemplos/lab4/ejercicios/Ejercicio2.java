// Obtener el área de un cuadrado y de un rectángulo

public class Ejercicio2 {
    public static double area(double lado) {
        return lado * lado;
    }

    public static double area(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        System.out.printf("Area del cuadrado (lado 5) = %.2f%n", area(5));
        System.out.printf("Area del rectangulo (base 4, altura 6) = %.2f%n", area(4,6));
    }
}
