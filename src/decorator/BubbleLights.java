package decorator;

/**
 * @author: Olegario Zelada
 */
public class BubbleLights extends TreeDecorator {

    private static final String DECORATE_BUBBLE_LIGHTS = " with Bubble Lights";

    public BubbleLights(ChristmasTree tree){
        super(tree);
    }

    public String decorate(){
        return super.decorate() + decorateWithBubleLights();
    }

    public String decorateWithBubleLights(){
        return DECORATE_BUBBLE_LIGHTS;
    }
}
