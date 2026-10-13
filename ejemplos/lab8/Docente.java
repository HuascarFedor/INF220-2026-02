public class Docente extends Persona{
    private String item;
    private String especialidad;
    private int horasSemana;

    public Docente(String ci, String nombre, int edad,
                   String item, String especialidad, int  horasSemana) {
        super(especialidad, nombre, edad);
        this.item = item;
        this.especialidad = especialidad;
        this.horasSemana = horasSemana;
    }
}
