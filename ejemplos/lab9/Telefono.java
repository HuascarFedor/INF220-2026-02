public class Telefono extends Dispositivo {
    private String numero;

    public Telefono(String marca, String numero) {
        super(marca);
        this.numero = numero;
        System.out.println("[3] Telefono(String, String) -> numero = " + numero);
    }

    public Telefono(String numero) {
        this.numero = numero;
        System.out.println("[3] Telefono(String) -> numero = " + numero);
    }

    public void llamar(String destino, int minutos) {
        if(!encendido) {
            System.out.println(marca + ": no se puede llamar, el teléfono está apagado.");
            return;
        }
        System.out.println(numero + " llamando a " + destino + "(" + minutos + "min)...");
        consumir(minutos * 5);
    }
}
