import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Eighteen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Clock");
		frame.setLayout(new BorderLayout());
		
		JPanel display = new JPanel();
		JLabel face = new JLabel(DateFormat.getInstance().format(new Date()));
		display.setBackground(Color.orange);
		display.add(face);
		frame.add(display, BorderLayout.CENTER);
		
		JButton adjust = new JButton("Adjust");
		JButton alarm = new JButton("Alarm");
		JPanel controls = new JPanel();
		controls.setLayout(new FlowLayout(FlowLayout.RIGHT));
		controls.add(adjust);
		controls.add(new JLabel("     "));
		controls.add(alarm);
		frame.add(controls, BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
