package BorderTest;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("BorderLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(5,5));
		this.setSize(200, 300);
		
		JPanel p = new JPanel(new BorderLayout(10,10));
		JButton button = new JButton("Center");
		p.add(button, BorderLayout.CENTER);		
		p.add(new JButton("Line Start"), BorderLayout.WEST);
		p.add(new JButton("Line End"), BorderLayout.EAST);
		p.add(new JButton("Page Start"), BorderLayout.NORTH);
		p.add(new JButton("Page End"), BorderLayout.SOUTH);
		
		this.add(p);
		pack(); //프레임의 크기를 컴포넌트의 크기에 맞춘다.
		setVisible(true);
	}
}

public class BorderTest {

	public static void main(String[] args) {

		new MyFrame();

	}

}
