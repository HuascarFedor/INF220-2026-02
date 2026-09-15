import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
        Map<String, Double> productos = new HashMap<>();

        productos.put("pan", 0.50);
        productos.put("leche", 6.00);
        productos.put("arroz", 8.50);
        productos.put("azucar", 7.00);
        productos.put("aceite", 14.50);

        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Productos disponibles: " + productos.keySet());
            System.out.print("Consultar precio de: ");

            String nombre = sc.nextLine().trim().toLowerCase();

            if(productos.containsKey(nombre)) { // Dentro de productos exixte pan
                double precio = productos.get(nombre);
                System.out.printf("El precio de '%s' es de Bs. %.2f%n", nombre, precio);
            } else {
                 System.out.printf("El producto '%s' no está registrado.", nombre);
            }
        }
    }
}
