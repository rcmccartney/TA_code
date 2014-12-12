import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ten {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(6, 2, 3, 4, 5, 1, 7, 8));
		Iterator<Integer> i = list.iterator();
		while(i.hasNext()) {
			if(i.next().intValue() % 2 == 0) { //assuming list contains no nulls
				i.remove();
			}
		}
		System.out.println(list.toString());
	}

}
