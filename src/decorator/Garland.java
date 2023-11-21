package decorator;

/**
 * @author: Olegario Zelada
 */
public class Garland extends TreeDecorator {

    private static final String GARLAND = " with Garland";

    public Garland(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }

    private String decorateWithGarland() {
        return GARLAND;
    }
}