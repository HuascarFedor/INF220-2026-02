import java.util.NoSuchElementException;

public class ColaEnlazada<T> implements Cola<T> {
    private static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;
        Nodo(T dato) {
            this.dato = dato;
        }
    }
    
    private Nodo<T> inicio;
    private Nodo<T> fin;
    private int tamanio;

    @Override
    public void encolar(T elemento) {
        Nodo<T> nuevo = new Nodo<>(elemento);
        if(estaVacia()) inicio = nuevo;
        else fin.siguiente = nuevo;
        fin = nuevo;
        tamanio++;
    }

    @Override
    public T desencolar() {
        if(estaVacia()) throw new NoSuchElementException("Cola vacia");
        T dato = inicio.dato;
        inicio = inicio.siguiente;
        if(inicio==null) fin = null; // la cola queda vacía
        tamanio--;
        return dato;
    }

    @Override
    public T frente() {
        if(estaVacia()) throw new NoSuchElementException("Cola vacia");
        return inicio.dato;
    }

    @Override 
    public boolean estaVacia() {
        return inicio == null;
    }

    @Override 
    public int tamanio() {
        return tamanio;
    }

    @Override 
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Nodo<T> q = inicio;
        while(q!=null) {
            sb.append(q.dato);
            if(q!=fin) sb.append(", ");
            q = q.siguiente;
        }
        sb.append("]");
        return sb.toString();
    }
}
