import java.util.ArrayList;
import java.util.Scanner;

public class wk1 {

	public static void main(String[] args) {
		new wk1().conditionTires(10);
	}	
	
	
	private double conditionTires(double time) {
		double x = Math.exp( - (( time*time-(10*time) +25)/25)/2) / 
			Math.sqrt(2 * Math.PI);
		System.out.println("ans: " + x);
		return x;
	}

}
