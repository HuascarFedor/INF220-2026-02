public class CuentaBancaria {
    private final String numero;
    private final String titular;
    protected double saldo;

    public CuentaBancaria(String numero, String titular, double saldoInicial) {
        if(saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if(monto <= 0) {
            System.out.println("Deposito invalido!!!");
            return;
        }
        saldo +=monto;
    }

    public boolean retirar(double monto) {
        if(monto <= 0 || monto > saldo) {
            System.out.println("Retiro rechazado!!!");
            return false;
        }
        saldo -=monto;
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s | %s |saldo Bs. %.2f", numero, titular, saldo);
    }
}