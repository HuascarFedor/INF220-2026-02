public class Rectangulo {
    private double base;
    private double altura;

    public double area() {
        return base * altura;
    }

    public double perimetro() {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        Rectangulo r = new Rectangulo();
        r.base = 5;
        r.altura = 3;

        System.out.println("Área: "+r.area());
        System.out.println("Perímetro: "+r.perimetro());
    }
}
