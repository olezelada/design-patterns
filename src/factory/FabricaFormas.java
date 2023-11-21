package factory;

/**
 * @author: Olegario Zelada
 */
public class FabricaFormas {

    private static final String CIRCULO = "Circulo";
    private static final String CUADRADO = "Cuadrado";
    private static final String RECTANGULO = "Rectangulo";
    private static final String INESPERADO = "valor inesperado";

    private FabricaFormas() {
        throw new IllegalStateException("Factory Class");
    }

    public static Forma getForma(String type) {

        if (null == type) {
            return null;
        }

        if (type.equalsIgnoreCase(CIRCULO)) {
            return new Circulo();
        } else if (type.equalsIgnoreCase(CUADRADO)) {
            return new Cuadrado();
        } else if (type.equalsIgnoreCase(RECTANGULO)) {
            return new Rectangulo();
        } else {
            throw new IllegalMonitorStateException(INESPERADO + " : " + type);
        }

    }
}
