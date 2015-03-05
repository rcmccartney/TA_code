/**
 * Created by AL on 3/2/15.
 */
public class PersonA {
    public static void main(String args[]) {
        Person p = new Person() {
            @Override
            public void talk() {
                System.out.println("I talk");
            }

            @Override
            public void walk() {
                System.out.println("I walk");
            }
            @Override
            public void think() {
                System.out.println("I don't think");
            }
        };
    }
}
