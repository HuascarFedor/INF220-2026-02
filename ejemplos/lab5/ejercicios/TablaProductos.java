/* 
    Formatear cadenas

    %-20s -> texto alineado a la izquierda en un ancho de 20
    %10.2f -> numero real alineado a la derecha, ancho de 10 y 2 decimales
    %10d -> numero entero alineado a la derecha en ancho de 10
*/
public class TablaProductos {
    public static void main(String[] args) {
        String[] nombres = {"Teclado", "Monitor", "Mouse inalambrico"};
        double[] precios = {120.50, 890.00, 75.90};
        int[] cantidades = {15, 4, 30};

        // Encabezados de la tabla
        System.out.printf("%-20s %10s %10s%n", "PRODUCTO", "PRECIO", "CANTIDAD");
        System.out.printf("%-20s %10s %10s%n", "--------", "------", "--------");

        for(int i = 0; i<nombres.length; i++) {
            System.out.printf("%-20s %10.2f %10d%n", nombres[i], precios[i], cantidades[i]);
        }
    }
}
