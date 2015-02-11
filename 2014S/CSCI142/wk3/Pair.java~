public class Pair<E> {
	
	public E first ; 
	private E second ; 
	private int numSwaps ;
	
	public Pair(E f, E s) 
	{ 
		first = f;
		second = s;
		numSwaps = 0;
	}

	public void swap() { 
		E temp = first;
		first = second; 
		second = temp; 
		numSwaps++;
	}

	public static void main(String[] args) {

		Pair<Integer> pI = new Pair<Integer>(4, 5);
		Pair<Double> pD = new Pair<Double>(3.33, 7.7);
		
		pD.swap();
		System.out.println("first: " + pD.first); 

	}
}
