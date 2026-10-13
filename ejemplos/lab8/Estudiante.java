public class Estudiante extends Persona {
    private String ru;
    private String carrera;
    private int semestre;

    public Estudiante(String ci, String nombre, int edad,
                      String ru, String carrera, int semestre) {
        super(ci, nombre, edad);
        this.ru = ru;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String fichaAcademica() {
        return getNombre() + " | RU: " + ru + " | Carrera: " + carrera + " | Semestre: " + semestre;
    }

    public void avanzarSemestre() {
        if(semestre<10) {
            semestre++;
        }
    }
}
