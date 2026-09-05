public class Ejemplo6 {
    public static void main(String[] args) {
        String nombre = "Ana";
        double promedio = 78.456;

        System.out.printf("%s obtuvo %.2f%n", nombre, promedio);

        String linea = String.format("%-10s obtuvo %.2f", nombre, promedio);
        System.out.println(linea);
    }
}
