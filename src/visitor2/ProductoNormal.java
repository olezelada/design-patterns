package visitor2;

/**
 * @author: Olegario Zelada
 */
public class ProductoNormal implements Visitable{
    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
