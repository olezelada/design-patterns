package firstaheaddesignpatterns.turkey_adapter;

/*
* @Olegario: Now, for the exercise let'singleresponsability say you're short on Duck objects and
* you'd like to use some turkey objects in their place. Obviously we can\t use
* the turkeys outright because they have a different interface.
*
* So, Let'singleresponsability write an Adapter
* */

public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for( int i=0; i<5; i++){
            turkey.fly();
        }
    }
}
