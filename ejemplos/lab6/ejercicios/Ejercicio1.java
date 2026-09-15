/*
 Crear un ArrayList<Estudiante>, agrega varios estudiantes y muestra solo los que aprobaron (promedio >= 51)
*/

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();

        estudiantes.add(new Estudiante("Ana", 78.0));
        estudiantes.add(new Estudiante("Luisa", 45.0));
        estudiantes.add(new Estudiante("Pedro", 51.0));
        estudiantes.add(new Estudiante("Juan", 33.0));
        estudiantes.add(new Estudiante("Elena", 90.0));

        System.out.println("Estudiantes aprobados");

        for(Estudiante estudiante : estudiantes) {
            if(estudiante.getPromedio() >= 51) {
                System.out.printf("%-8s promedio: %.1f%n", estudiante.getNombre(), estudiante.getPromedio());
            }
        }
    }
}

class Estudiante {
    private final String nombre;
    private final double promedio;

    public Estudiante(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public String getNombre() {
        return  nombre;
    }

    public  double getPromedio() {
        return promedio;
    }
}