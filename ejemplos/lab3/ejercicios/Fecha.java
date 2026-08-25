public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        setDia(dia);
        setMes(mes);
        setAnio(anio);
    }

    // --- Getters ---
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAnio() {
        return anio;
    }

    // --- Setters ---
    public void setDia(int dia) {
        if(dia < 1 || dia > 31) {
            System.out.println("Aviso: dia invalido.");
            return;
        }
        this.dia = dia;
    }

    public void setMes(int mes) {
        if(mes < 1 || mes > 12) {
            System.out.println("Aviso: mes invalido.");
            return;
        }
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Metodo propio de la clase Fecha
    // Representar la fecha en el formato dd/mm/aaaa
    public String mostrar() {
        return String.format("%02d/%02d/%04d", dia, mes, anio);
    }

    // Demostración rápida

    public static void main(String[] args) {
        Fecha f = new Fecha(24, 8, 2026);
        System.out.println("Fecha: " + f.mostrar());
    }
}
