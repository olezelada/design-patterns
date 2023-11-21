package decorator;

/**
 * @author: Olegario Zelada
 */
public abstract class TreeDecorator implements ChristmasTree{

    private ChristmasTree tree;

    //standard construct
    public TreeDecorator(ChristmasTree tree) {
        this.tree = tree;
    }

    @Override
    public String decorate(){
        return tree.decorate();
    }
}
