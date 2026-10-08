public class CuentaBancaria {
    public enum TipoCuenta { AHORROS, CORRIENTE }

    private String nombres;
    private String apellidos;
    private String numeroCuenta;
    private TipoCuenta tipo;
    private double saldo=0;

    public CuentaBancaria(String nombres, String apellidos,
                         String numeroCuenta, TipoCuenta tipo) {
        this.nombres=nombres;
        this.apellidos = apellidos;
        this.numeroCuenta=numeroCuenta;
        this.tipo = tipo;
    }

    public void imprimir() {
        System.out.println("Titular: " + nombres + " " + apellidos);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Tipo: " + tipo);
        System.out.println("Saldo: " + saldo);
    }

    public double consultarSaldo() {
        return saldo;
    }

    public boolean consignar(double valor) {
        if (!Double.isFinite(valor) || valor<=0
                || !Double.isFinite(saldo+valor)) {
            System.out.println("Valor de consignacion invalido");
            return false;
        }
        saldo=saldo+valor;
        return true;
    }

    public boolean retirar(double valor) {
        if (!Double.isFinite(valor) || valor<=0) {
            System.out.println("El retiro debe ser un valor positivo");
            return false;
        }
        if (valor>saldo) {
            System.out.println("Saldo insuficiente");
            return false;
        }
        saldo = saldo-valor;
        return true;
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta=new CuentaBancaria("Thomas", "Ramirez",
                "00123456", TipoCuenta.AHORROS);
        cuenta.imprimir();
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        System.out.println("Saldo: " + cuenta.consultarSaldo());
        cuenta.retirar(400000);
        System.out.println("Saldo: " + cuenta.consultarSaldo());
        cuenta.retirar(150000);
        System.out.println("Saldo final: " + cuenta.consultarSaldo());
    }
}
