/**
 * Created by AL on 3/2/15.
 */
public interface Person {
    public abstract void talk();
    public void walk();
    public default void breathe() {
        System.out.println("I breathe");
    }
    public default void think() {
        System.out.println("I think");
    }
}



