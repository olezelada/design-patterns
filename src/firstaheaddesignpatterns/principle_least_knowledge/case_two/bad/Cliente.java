package firstaheaddesignpatterns.principle_least_knowledge.case_two.bad;

public class Cliente {
    private Banco banco;
    private CuentaBancaria cuenta;

    public Cliente(Banco banco, CuentaBancaria cuenta) {
        this.banco = banco;
        this.cuenta = cuenta;
    }

    public void realizarTransferencia(CuentaBancaria destino, double cantidad) {
        banco.transferir(cuenta, destino, cantidad);
    }
}
