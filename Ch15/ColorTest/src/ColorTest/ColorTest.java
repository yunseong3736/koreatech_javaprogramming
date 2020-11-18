package ColorTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	JButton button;
	Color color = new Color(0,0,0);
	
	public MyPanel() {
		this.setLayout(new BorderLayout());
		button = new JButton();
		button.setText("Change Color");
		button.addActionListener(new MyListener());
		this.add(button, BorderLayout.SOUTH);
	
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(color);
		g.fillRoundRect(10, 10, 210, 220, 10, 10);
		this.setBackground(Color.yellow);
	}
	
	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			color = new Color( (int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255) );
			repaint();
		}
	}
	
}

class MyFrame extends JFrame {
	public MyFrame() {
		this.setTitle("Color Change Test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(240, 300);
		this.add(new MyPanel());
		this.setVisible(true);
	}
}

public class ColorTest {

	public static void main(String[] args) {

		new MyFrame();

	}

}
