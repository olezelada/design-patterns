package firstaheaddesignpatterns.principle_least_knowledge.case_two.bad;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<CuentaBancaria> cuentas = new ArrayList<>();

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public void transferir(CuentaBancaria origen, CuentaBancaria destino, double cantidad) {
        // Lógica para realizar la transferencia entre cuentas
        if (cuentas.contains(origen) && cuentas.contains(destino)) {
            origen.depositar(-cantidad);
            destino.depositar(cantidad);
        }
    }
}
