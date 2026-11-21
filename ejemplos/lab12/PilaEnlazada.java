public class PilaEnlazada<T> implements Pila<T> {
    private static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;
        Nodo(T dato, Nodo<T> siguiente) {
            this.dato = dato;
            this.siguiente = siguiente;
        }
    }

    private Nodo<T> tope;
    private int tamanio;

    @Override 
    public void push(T elemento) {
        tope = new Nodo<>(elemento, tope);
        tamanio++;
    }

    @Override
    public T pop() {
        if(estaVacia()) throw new PilaVaciaException("pop");
        T dato = tope.dato;
        tope =tope.siguiente;
        tamanio--;
        return dato;
    }

    @Override 
    public T peek() {
        if(estaVacia()) throw new PilaVaciaException("peek");
        return tope.dato;
    }

    @Override 
    public boolean estaVacia() {
        return tope == null;
    }

    @Override 
    public int tamanio() {
        return tamanio;
    }
}
