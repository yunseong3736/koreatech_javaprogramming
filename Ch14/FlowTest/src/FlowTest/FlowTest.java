package FlowTest;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("FlowLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JPanel panel;
		//panel = new JPanel();
		//panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.TRAILING, 10, 20));
		
		JButton button1 = new JButton("Button1");
		button1.setPreferredSize(new Dimension(80, 40));
		panel.add(button1);
		
		JButton button2 = new JButton("Button2");
		button2.setPreferredSize(new Dimension(80,20));
		panel.add(button2);
		panel.add(new JButton("Button3"));
		panel.add(new JButton("B4"));
		panel.add(new JButton("Long Button5"));
		this.add(panel);
		
		pack(); //프레임의 크기를 컴포넌트의 크기에 맞춘다.
		setVisible(true);
	}
}

public class FlowTest {

	public static void main(String[] args) {

		MyFrame f = new MyFrame();
		
	}

}
