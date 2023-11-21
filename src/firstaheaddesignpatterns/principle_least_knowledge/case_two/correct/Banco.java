package firstaheaddesignpatterns.principle_least_knowledge.case_two.correct;

import firstaheaddesignpatterns.principle_least_knowledge.case_two.bad.CuentaBancaria;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<CuentaBancaria> cuentas = new ArrayList<>();

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

}
