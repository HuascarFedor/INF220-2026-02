public class Dispositivo {
    protected String marca;
    protected boolean encendido;
    protected int bateria;

    public Dispositivo() {
        this("Genérica");
        System.out.println("[2] Dispositivo() -> constructor sin parámetros");
    }

    public Dispositivo(String marca) {
        this.marca = marca;
        this.encendido = false;
        this.bateria = 100;
        System.out.println("[1] Dispositivo(String) -> marca = " + marca);
    }

    public void encender() {
        encendido = true;
        System.out.println(marca + ": encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println(marca + ": apagado.");
    }

    protected void consumir(int porcentaje) {
        bateria = Math.max(0, bateria - porcentaje);
        if(bateria == 0) {
            apagar();
        }
    }

    public String estado() {
        return marca + " [" + (encendido? "ON" : "OFF") + ", bateria " + bateria + "%]";
    }
}