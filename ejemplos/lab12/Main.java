public class Main {
    public static void main(String[] args) {
        /* 
        PilaArreglo<Integer> p = new PilaArreglo<>();
        for(int i = 1; i<5; i++)
            p.push(i * 10);
        System.out.println("Pila: " + p + " capacidad=" + p.capacidad());
        System.out.println("Pop= " + p.pop() + " peek=" + p.peek() + " Tamaño=" + p.tamanio());
        */

        PilaEnlazada<Integer> p = new PilaEnlazada<>();
         for(int i = 1; i<=5; i++)
            p.push(i * 10);
        System.out.println("Pop= " + p.pop() + " peek=" + p.peek() + " Tamaño=" + p.tamanio());
    }
}
