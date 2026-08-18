public class Estudiante {
    String nombre;
    int edad;
    double promedio;

    void mostrarDatos() {
        System.out.println(nombre + " ( " + edad + " años ) - promedio: " + promedio);
    }

    boolean aprobo() {
        return promedio >= 51;
    }
}
