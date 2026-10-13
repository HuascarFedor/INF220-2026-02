public class Persona {
    private String ci;
    private String nombre;
    private int edad;

    public Persona(String ci, String nombre, int edad) {
        this.ci = ci;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getCi() { return ci; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    public void setEdad(int edad) {
        this.edad = validarEdad(edad);
    }

    private static int validarEdad(int edad) {
        if(edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        return  edad;
    }

    public String presentarse() {
        return "Hola, soy " + nombre + " y tengo " + edad + " años";
    }

    @Override 
    public String toString() {
        return "Persona[ci=" + ci + ", nombre=" + nombre + ", edad=" + edad + "]";
    }
}