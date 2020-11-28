package MouseEventTest2;

import java.awt.Graphics;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	JLabel label = new JLabel();
	int x = 100 ,y = 100;
	public MyPanel() {
		label.setText("KoreaTech CSE");
		this.add(label);
		this.addMouseWheelListener(new MyWheelListener());
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		label.setLocation(x,y);
	}
	
	private class MyWheelListener implements MouseWheelListener{
		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			if (e.getWheelRotation() == 1) y += 10;
			else y -= 10;
			repaint();
		}
	}
}

public class MouseEventTest2 extends JFrame{

	public MouseEventTest2() {
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new MyPanel());
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseEventTest2();
	}

}
