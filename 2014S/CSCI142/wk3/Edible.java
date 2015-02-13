public interface Edible {

	public void eat();
	public boolean throwOut();	

}


class OldFruit {
	public String expiration = "Sep 1, 2013";
}

class Apple extends OldFruit implements Edible {
	
	public Apple() {
		super();
		System.out.println(expiration);
	}

}
