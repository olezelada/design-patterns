package firstaheaddesignpatterns.principle_least_knowledge.case_two.correct;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        // Lógica para depositar dinero en la cuenta
        saldo += cantidad;
    }

    public void transferir(CuentaBancaria destino, double cantidad){
        // Lógica para realizar la transferencia entre cuentas
        destino.depositar(cantidad);
    }
}
