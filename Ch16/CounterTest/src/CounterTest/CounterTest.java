package CounterTest;
//p423
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	private int count = 0;
	JLabel l1, l2;
	JButton b1, b2, b3;
	MyListener listener = new MyListener();
	public MyPanel() {
		l1 = new JLabel("Counter");
		l2 = new JLabel(String.valueOf(count));
		this.add(l1);
		this.add(l2);
		
		b1 = new JButton("Increase");
		b2 = new JButton("Decrease");
		b3 = new JButton("Reset");
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		this.add(b1);
		this.add(b2);
		this.add(b3);
	}
	
	private class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Increase")) count++;
			else if (e.getActionCommand().equals("Decrease")) count--;
			else if (e.getActionCommand().equals("Reset")) count = 0;
			
			if (count < 0) count = 0;
			l2.setText(String.valueOf(count));
		}
	}
}

public class CounterTest extends JFrame{

	public CounterTest() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new MyPanel());
		this.setTitle("Counter");
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new CounterTest();
	}

}
