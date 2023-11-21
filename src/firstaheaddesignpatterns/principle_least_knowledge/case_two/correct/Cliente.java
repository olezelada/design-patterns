package firstaheaddesignpatterns.principle_least_knowledge.case_two.correct;

public class Cliente {
    private CuentaBancaria cuenta;

    public Cliente(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    public void realizarTransferencia(CuentaBancaria destino, double cantidad) {
        cuenta.transferir(destino, cantidad);
    }
}
