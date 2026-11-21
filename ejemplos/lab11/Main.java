public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.insertarFinal(25);
        lista.insertarFinal(37);
        lista.insertarFinal(12);
        lista.insertarFinal(48);
        lista.insertarInicio(7);

        System.out.println("Lista: " + lista);

        System.out.println("Ubicación: " + lista.buscar(12));

        lista.insertarEn(3, 77);
        System.out.println("Lista: " + lista);
    }
}
