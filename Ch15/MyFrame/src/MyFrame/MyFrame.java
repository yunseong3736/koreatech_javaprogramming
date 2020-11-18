package MyFrame;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("안녕하세요? 자바 프로그래머 여러분!", 10, 10);
		g.drawLine(10, 20, 110, 20);
		g.drawRect(10, 30, 100, 100);
		g.drawOval(20,30,200,200);
	}
}

public class MyFrame extends JFrame {

	public MyFrame() {
		setTitle("MyFrame");
		setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel p = new MyPanel();
		this.setVisible(true);
		this.add(p);
	}
	
	public static void main(String[] args) {
		
		new MyFrame();

	}

}