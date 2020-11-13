package GridTest;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame extends JFrame {
	public MyFrame() {
		this.setTitle("GridLayoutTest");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,200);
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2,3,5,5));
		
		for (int i = 1; i <= 5; i++)
			makeButton(p, "Button" + i);
		this.add(p);
		
		pack();
		setVisible(true);
		
	}
	void makeButton(JPanel p, String str) {
		JButton b = new JButton(str);
		b.setSize(new Dimension(100, 30));
		p.add(b);
	}
}

public class GridTest {

	public static void main(String[] args) {

		new MyFrame();

	}

}
