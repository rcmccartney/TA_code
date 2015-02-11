import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Nine {

	
	public static ActionListener get(boolean type) {
		if(type) {
			return new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("Yes");
				}
			};
		}
		
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("No");
			}
		};
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
