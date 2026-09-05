public class Ejemplo1 {
    public static void main(String[] args) {
        String texto = " Programación en Java ";

        System.out.println("Longitud: " + texto.length());
        System.out.println("Sin espacios: " + texto.trim());
        System.out.println("Mayúsculas: " + texto.toUpperCase());
        System.out.println("Minúsculas: " + texto.toLowerCase());
        System.out.println("Posición de 'Java': " + texto.indexOf("Java"));
        System.out.println("Reemplazo: " + texto.replace("Java", "POO"));
        System.out.println("Subcadena: " + texto.trim().substring(0, 12));
    }
}