public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public double valorTotal() {
        return precio * cantidad;
    }

    public static void main(String[] args) {
        Producto p1 = new Producto();
        p1.nombre = "Teclado";
        p1.precio = 120.0;
        p1.cantidad = 10;

        Producto p2 = new Producto();
        p2.nombre = "Mouse";
        p2.precio = 65.5;
        p2.cantidad = 25;

        Producto p3 = new Producto();
        p3.nombre = "Monitor";
        p3.precio = 850.0;
        p3.cantidad = 4;

        Producto p4 = new Producto();
        p4.nombre = "Cable HDMI";
        p4.precio = 30.0;
        p4.cantidad = 40;

        Producto[] inventario = {p1, p2, p3, p4};
        double totalInventario = 0;
        for(Producto p : inventario){
            System.out.printf("%-12s -> %.2f Bs%n", p.nombre, p.valorTotal());
            totalInventario += p.valorTotal();
        }
        System.out.printf("%nValor total del inventario: %.2f Bs%n", totalInventario);
    }
}
