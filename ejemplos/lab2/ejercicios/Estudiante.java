public class Estudiante {
    private String nombre;
    private double promedio;

    public boolean estaEnRiesgo() {
        return promedio < 51;
    }

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        e1.nombre = "Juan";
        e1.promedio = 78.0;

        Estudiante e2 = new Estudiante();
        e2.nombre = "Ana";
        e2.promedio = 56.0;

        Estudiante e3 = new Estudiante();
        e3.nombre = "Marco";
        e3.promedio = 42.0;

        Estudiante e4 = new Estudiante();
        e4.nombre = "Carlos";
        e4.promedio = 50.0;
        
        Estudiante[] curso = {e1, e2, e3, e4};
        for (Estudiante estudiante : curso) {
            if (estudiante.estaEnRiesgo()) {
                System.out.println(estudiante.nombre + " está en riesgo con un promedio de " + estudiante.promedio);
            } else {
                System.out.println(estudiante.nombre + " no está en riesgo con un promedio de " + estudiante.promedio);
            }
        }
    }
}
