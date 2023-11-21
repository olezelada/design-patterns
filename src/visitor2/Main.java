package visitor2;

/**
 * @author: Olegario Zelada
 */
public class Main {
    public static void main(String[] args){
        ProductoDecuento descuento = new ProductoDecuento();
        ProductoNormal normal = new ProductoNormal();

        normal.setPrecio(100);
        descuento.setPrecio(100);

        IVA iva = new IVA();

        double resNormal = normal.accept(iva);
        double resDescuento = descuento.accept(iva);


        System.out.println("----------NORMAL---------");
        System.out.println(resNormal);
        System.out.println("----------DESCUENTO------");
        System.out.println(resDescuento);
    }
}
