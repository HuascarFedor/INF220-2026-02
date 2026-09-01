public class Utilidades {
    public void saludar(String nombre) {
        System.out.println("Hola, " + nombre);
    }
    
    public int cuadrado(int n) {
        return n * n;
    }

    static public void main(String[] args){
        Utilidades u = new Utilidades();
        u.saludar("Ana");
        int r = u.cuadrado(5);
        System.out.println("El cuadrado de 5 es " + r);
    }
}
