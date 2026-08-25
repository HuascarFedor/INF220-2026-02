public class Rectangulo {
    // Atributos encapsulados (private)
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    // --- Getters ---
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    // -- Setters ---
    public void setBase(double base) {
        if(base < 0) {
            System.out.println("Aviso: la base no puede ser negativa. Se ignora el valor " + base);
            return;
        }
        this.base = base;
    }

    public void setAltura(double altura) {
        if(altura < 0) {
            System.out.println("Aviso: la altura no puede ser negativa. Se ignora el valor " + altura);
            return;
        }
        this.altura = altura;
    }

    // --- Comportamiento propio del rectángulo ---
    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    // Demostración rápida
    public static void main(String []args) {
        Rectangulo r = new Rectangulo(4, 3);
        System.out.println("Base: " + r.getBase());
        System.out.println("Altura: " + r.getAltura());
        System.out.println("Area: " + r.calcularArea());
        System.out.println("Perimetro: " + r.calcularPerimetro());

        // Verificación de la proteccion de los datos
        r.setAltura(-10);
        System.out.println("Altura: " + r.getAltura());
    }
}
