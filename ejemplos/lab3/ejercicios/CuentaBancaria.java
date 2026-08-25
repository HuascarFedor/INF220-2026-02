public class CuentaBancaria {
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public CuentaBancaria(String titular) {
        this(titular, 0.0);
    }

    // Getters
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Operaciones básicas
    public void depositar(double monto) {
        if(monto <= 0) {
            System.out.println("Aviso: el monto a depositar debe ser positivo.");
            return;
        }
        saldo += monto; // saldo = saldo + monto
    }

    public void retirar(double monto) {
        if(monto <= 0) {
            System.out.println("Aviso: el monto a retirrar debe ser positivo.");
            return;
        }
        if(monto > saldo) {
            System.out.println("Aviso: saldo insuficiente. Saldo actual Bs." + saldo);
            return;
        }
        saldo -= monto; // saldo = monto - saldo
    }

    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria("Ana Lopez", 1500.0);
        CuentaBancaria c2 = new CuentaBancaria("Luis Mamani");

        System.out.println(c1.getTitular() + " -> Saldo inicial: Bs. " + c1.getSaldo());
        System.out.println(c2.getTitular() + " -> Saldo inicial: Bs. " + c2.getSaldo());

        c2.depositar(200);
        System.out.println(c2.getTitular() + " -> Saldo inicial: Bs. " + c2.getSaldo());
        c2.retirar(50);
        System.out.println(c2.getTitular() + " -> Saldo inicial: Bs. " + c2.getSaldo());
    }
}
