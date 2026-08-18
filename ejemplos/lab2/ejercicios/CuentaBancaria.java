public class CuentaBancaria {
    private double saldo;

    public void depositar(double monto) {
        if(monto > 0) {
            saldo += monto; // saldo = saldo + monto;
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if(monto <= 0){
            System.out.println("El monto a retirar debe ser positivo.");
        } else if (monto > saldo) {
            System.out.println("Fondos insuficientes: el retiro dejaria el saldo negativo.");
        } else {
            saldo -= monto; //saldo = saldo - monto;
        }

        /*
        if (monto <= saldo) {
            saldo = monto - saldo; // saldo = saldo - monto;
        } else if (monto < 0) {
            System.out.println("Fondos negativos.");
        } else {
            System.out.println("Fondos insuficientes para realizar el retiro.");
        }
        */
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.saldo = 100;

        cuenta.depositar(150);
        System.out.println("Saldo: " + cuenta.saldo);
        cuenta.retirar(100);
        System.out.println("Saldo: " + cuenta.saldo);
        cuenta.retirar(500);
        System.out.println("Saldo: " + cuenta.saldo);
    }
}
