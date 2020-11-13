package myframetest3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame {
	public MyFrame() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My Frame");
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Hello World!!");
		JButton button = new JButton("Button");
		
		button.setBorderPainted(false);
		button.setContentAreaFilled(true);
		button.setRolloverEnabled(true);
		button.setToolTipText("Button test");
		
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
		System.out.println(label.getText());
	}
}

public class MyFrameTest3 {

	public static void main(String[] args) {
		
		MyFrame f = new MyFrame();

	}

}
