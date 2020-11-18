package ColorChooserTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	JButton button;
	Color color = new Color(0,0,0);
	MyListener listener = new MyListener();
	
	public MyPanel() {
		this.setLayout(new BorderLayout());
		button = new JButton("Change Color");
		button.addActionListener(listener);
		this.add(button, BorderLayout.SOUTH);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(color);
		g.fillRoundRect(10, 10, 210, 220, 10, 10);
		this.setBackground(Color.yellow);
	}
	
	private class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			color = JColorChooser.showDialog(MyPanel.this, "Choose a color", color);
			repaint();
		}
	}
	
}

public class ColorChooserTest extends JFrame{

	public static void main(String[] args) {
		new ColorChooserTest();
	}
	public ColorChooserTest() {
		this.setTitle("Color Chooser Test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new MyPanel());
		pack();
		this.setVisible(true);
	}

}
