package firstaheaddesignpatterns.principle_least_knowledge.case_two.bad;

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
}
