public class CuentaAhorro extends CuentaBancaria {
    private static final int MAX_RETIROS_MES = 3;
    private final double tasaAnual;
    private int retirosDelMes;

    public CuentaAhorro(String numero, String titular, double saldoInicial, double tasaAnual) {
        super(numero, titular, saldoInicial);
        this.tasaAnual = tasaAnual;
        this.retirosDelMes = 0;
    }
}
