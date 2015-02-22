
public class P {
	
	public P(int i) {
		System.out.println(i);
	}
	
	public void foo() {
		System.out.println("inside foo");
	}

	public static void main(String[] args) {
		new C().foo();
	}
}

class C extends P {

	public C() {
		super(1);
		System.out.println("done");
	}

	public void foo() {
		super.foo();
		System.out.println("child foo");
	}
}


