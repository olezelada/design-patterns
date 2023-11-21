package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Olegario Zelada
 */
public class Main {
    public static void main(String[] args){
        Gerrero paladin = new Gerrero();
        Gerrero artas = new Gerrero();

        Mago lich = new Mago();
        Mago kael = new Mago();

        List<Personaje> personajes = new ArrayList<>();
        personajes.add(paladin);
        personajes.add(artas);
        personajes.add(lich);
        personajes.add(kael);

        Visitor visitorArmar = new ArmarPersonaje();
        visitorArmar.visit(personajes);

        System.out.println("Arma del guerrero Paladin "+paladin.getArma());
        System.out.println("Arma del guerrero Artas "+artas.getArma());
        System.out.println("Arma del Rey Lich "+lich.getArma());
        System.out.println("Arma del Mago Kael "+kael.getArma());
    }
}
