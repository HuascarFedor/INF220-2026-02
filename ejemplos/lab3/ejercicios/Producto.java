public class Producto {
   private String nombre;
   private double precio; 

   // Constructor
   public Producto(String nombre, double precio) {
      this.nombre = nombre;
      setPrecio(precio);
   }

   // --- Getters ---
   public String getNombre() {
      return nombre;
   }
   
   public double getPrecio() {
      return precio;
   }

   // --- Setters ---
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public void setPrecio(double precio) {
      if(precio < 0) {
         System.out.println("Aviso: el precio no puede ser negativo");
         return;
      }
      this.precio = precio;
   }

   // Demostración rapida
   public static void main(String[] args) {
      Producto p = new Producto("Teclado maecanico", 250.0);
      System.out.println(p.getNombre() + " -> Bs. " + p.getPrecio());

      // Intento invalido
      p.setPrecio(-99);
      System.out.println(p.getNombre() + " -> Bs. " + p.getPrecio());

      // Intento valido
      p.setPrecio(199.0);
      System.out.println(p.getNombre() + " -> Bs. " + p.getPrecio());
   }
}
