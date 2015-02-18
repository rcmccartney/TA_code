/**
 * This week we focus on inheritance and abstract classes.
 * Below is a quick example of how polymorphism can be used.
 * Notice that the Child overwrites the Parent's method, but
 * the Parent's method can still be accessed via 'super'
 * keyword. To call a Parent method that has not been 
 * overwritten it can be called directly without super.
 *
 */
public class Parent {
	
	public Parent(int r) {
		System.out.println("here P" + r); 
	}
	
	public void foo(int bar) {
		System.out.println("hello");
	}

	public void bar(int foo) {
		int x = 1;
	}

	public static void main(String[] args) {
		Parent p = new Child();
		p.foo(4);
		p.bar(1);
		p = new Parent(1);
		p.foo(4);
	}
}

class Child extends Parent {

	public Child() {
		super(1);
	}

	public void foo(int bar) {
		super.foo(bar);
		bar(bar);
		System.out.println("goodbye");
	}
	
}




