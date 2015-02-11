public class Fib {

	public static int calcFib(int n) {
		
		System.out.println(Math.pow(2,4));	
		if (n == 1 || n == 0) {
			return 1;
		}
		else {
			return calcFib(n-1) + calcFib(n-2);
		}
	}

	public static void main(String[] args) {
		System.out.println("Answer: " + calcFib(7));
	}
}
