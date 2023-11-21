package visitor;

import java.util.List;

/**
 * @author: Olegario Zelada
 */
public class ArmarPersonaje implements Visitor {
    @Override
    public void visit(Mago mago) {
        mago.setArma("Posima de Conjuro");
    }

    @Override
    public void visit(Gerrero gerrero) {
        gerrero.setArma("Espada Sange Yasha");
    }

    @Override
    public void visit(List<Personaje> personajeList) {
        for (Personaje personaje: personajeList){
            personaje.accept(this);
        }
    }
}
