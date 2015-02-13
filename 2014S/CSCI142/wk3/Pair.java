public class Pair<T> {
	
	public T first ; 
	private T second ; 
	private int numSwaps ;
	
	public Pair(T f, T s) 
	{ 
		first = f;
		second = s;
		numSwaps = 0;
	}

	public void swap() { 
		T temp = first;
		first = second; 
		second = temp; 
		numSwaps++;
	}

	public static void main(String[] args) {

		Pair<Integer> pI = new Pair<Integer>(4, 5);
		Pair<Double> pD = new Pair<Double>(3.33, 7.7);
		pD.swap();
		System.out.println("first: " + pD.first); 
		pI.swap();
		System.out.println("first: " + pI.first); 
	}
}
