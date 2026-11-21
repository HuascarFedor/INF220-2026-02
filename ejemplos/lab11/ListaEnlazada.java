public class ListaEnlazada {
    private Nodo head;
    private int tamanio;

    public boolean estaVacia() {
        return head == null;
    }

    public int tamanio() {
        return tamanio;
    }

    public void insertarInicio(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = head;
        head = nuevo;
        tamanio++;
    }

    public void insertarFinal(int valor) {
        Nodo nuevo = new Nodo(valor);
        if(estaVacia()){
            head = nuevo;
        } else {
            Nodo actual = head;
            while(actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        tamanio++;
    }

    public int buscar(int valor) {
        Nodo actual = head;
        int i = 0;
        while(actual != null) {
            if(actual.dato == valor) return i;
            actual = actual.siguiente;
            i++;
        }
        return -1;
    }

    public void insertarEn(int indice, int valor) {
        validarIndice(indice, tamanio);
        if(indice == 0) {
            insertarInicio(valor);
            return ;
        }
        Nodo anterior = head;
        for(int i=0; i<indice-1; i++) {
            anterior = anterior.siguiente;
        }
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = anterior.siguiente;
        anterior.siguiente = nuevo;
        tamanio++;
    }

    private void validarIndice(int indice, int maximo) {
        if(indice<0 || indice>maximo) {
            throw new IndexOutOfBoundsException("Indice fuera de rango: " + indice);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Nodo actual = head;
        while(actual != null) {
            sb.append(actual.dato);
            if(actual.siguiente != null) sb.append(" -> ");
            actual = actual.siguiente;
        }
        return sb.append("]").toString();
    }
}
