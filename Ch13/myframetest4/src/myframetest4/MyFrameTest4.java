package myframetest4;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame {
	public MyFrame() {
		super();
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My Frame");
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Âî¸ð±â");
		
		JButton button1 = new JButton("Left");
		JButton button2 = new JButton("Center");
		JButton button3 = new JButton("Right");
		
		button3.setRolloverEnabled(false);
		button1.setToolTipText("Button Test");
		
		panel.add(label);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		add(panel);
		setVisible(true);
		System.out.println(label.getText());
		System.out.println(button1.getText());
	}
}

public class MyFrameTest4 {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
