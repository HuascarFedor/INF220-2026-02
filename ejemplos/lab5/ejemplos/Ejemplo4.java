public class Ejemplo4 {
    public static void main(String[] args) {
        String registro = "Ana,20,78.5";
        String[] partes = registro.split(",");

        System.out.println("Nombre: " + partes[0]);
        System.out.println("Edad: " + partes[1]);
        System.out.println("Promedio: " + partes[2]);
    }
}
