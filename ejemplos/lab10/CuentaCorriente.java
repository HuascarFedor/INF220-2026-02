public class CuentaCorriente extends CuentaBancaria{
    private final double limiteSobregiro;

    public CuentaCorriente(String numero, String titular, double saldoInicial, double limiteSobregiro) {
        super(numero, titular, saldoInicial);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public boolean retirar(double monto) {
         if(monto <= 0 || monto > saldo + limiteSobregiro) {
            System.out.println("Excede el sobregiro permitido!!!");
            return false;
        }
        saldo -=monto;
        return true;
    }

    private boolean estaEnSobreGiro() {
        return saldo < 0;
    }

    @Override
    public String toString() {
        return super.toString() + (estaEnSobreGiro() ? " | EN SOBREGIRO" : "");
    }

}
