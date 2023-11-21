package factory;

/**
 * @author: Olegario Zelada
 */
public class Main {
    public static void main(String arg[]){
        Forma forma = FabricaFormas.getForma("Cuadrado");
        forma.dibujar();
    }
}
