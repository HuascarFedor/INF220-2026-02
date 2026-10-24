public class Main {
    public static void main(String[] args) {
        CuentaAhorro ahorro = new CuentaAhorro("CA-001", "Jorge Choque", 1000, 0.06);
        System.out.println(ahorro.toString());

        ahorro.depositar(500);
        System.out.println(ahorro.toString());

        ahorro.retirar(200);
        System.out.println(ahorro.toString());

        System.out.println();

        CuentaCorriente corriente = new CuentaCorriente("CC-002", "Lucia Flores", 500, 300);
        corriente.retirar(900);
        System.out.println(corriente.toString());

    }
}
