package visitor;

import java.util.List;

/**
 * @author: Olegario Zelada
 */
public interface Visitor {
    void visit(Mago mago);
    void visit(Gerrero gerrero);
    void visit(List<Personaje> personajeList);
}
