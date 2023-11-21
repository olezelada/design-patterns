package visitor;

/**
 * @author: Olegario Zelada
 */
public class Mago implements Personaje {

    private String arma;

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
