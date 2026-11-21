public class PilaVaciaException extends RuntimeException {
    public  PilaVaciaException(String operacion) {
        super("No se puede hacer " + operacion + " en una pila vacia.");
    }
}
