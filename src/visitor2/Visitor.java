package visitor2;

/**
 * @author: Olegario Zelada
 */
public interface Visitor {
    public double visit (ProductoNormal normal);
    public double visit (ProductoDecuento descuento);
}
