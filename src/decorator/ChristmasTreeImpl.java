package decorator;

/**
 * @author: Olegario Zelada
 */
public class ChristmasTreeImpl implements ChristmasTree {

    private static final String TEXT = "Christmas Tree";

    @Override
    public String decorate() {
        return TEXT;
    }
}
