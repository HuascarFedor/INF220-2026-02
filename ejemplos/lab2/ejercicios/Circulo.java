public class Circulo {
    private double radio;

    public double area() {
        return Math.PI * radio * radio;
    }

    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.radio = 2;

        Circulo c2 = new Circulo();
        c2.radio = 20;

        System.out.printf("Área del circulo 1: %.2f%n", c1.area());
        System.out.printf("Área del circulo 2: %.2f%n", c2.area());
    }
}
