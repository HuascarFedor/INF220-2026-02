public class Paso {
    public static void modificar(int x) {
        x = 100;
    }

    public static void main(String[] args) {
        int numero = 5;
        modificar(numero);
        System.out.println(numero);    
    }
}
