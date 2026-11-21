import java.util.Arrays;

public class PilaArreglo<T> implements Pila<T> {
    private Object[] datos = new Object[4];
    private int tope = -1;

    @Override
    public void push(T elemento) {
        if(tope == datos.length -1) {
            datos = Arrays.copyOf(datos, datos.length * 2); // crecer x2
        }
        datos[++tope] = elemento;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public T pop() {
        if(estaVacia()) throw new PilaVaciaException("pop");
        T elemento = (T) datos[tope];
        datos[tope--] = null;
        return elemento;
    }

    @Override 
    @SuppressWarnings("unchecked")
    public T peek() {
        if(estaVacia()) throw new PilaVaciaException("pop");
        return (T) datos[tope];
    }

    @Override 
    public boolean estaVacia() {
        return tope == -1;
    }

    @Override 
    public int tamanio() {
        return tope + 1;
    }

    @Override 
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i <= tope; i++) {
            sb.append(datos[i]);
            if(i < tope) sb.append(", ");
        }
        return sb.append(" <- tope]").toString();
    }
    
    public int capacidad() {
        return datos.length;
    }
}
