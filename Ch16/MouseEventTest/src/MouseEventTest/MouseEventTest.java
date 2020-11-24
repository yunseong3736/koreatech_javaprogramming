package MouseEventTest;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame extends JFrame{
	public MyFrame() {
		this.setTitle("Mouse Event Test");
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.addMouseListener(new MyListener());
		panel.addMouseMotionListener(new MyListener());
		this.add(panel);
		this.setVisible(true);
		
	}
	
	private class MyListener implements MouseListener, MouseMotionListener{
		@Override
		public void mousePressed(MouseEvent e) {
			display("Mouse pressed (# of clicks: " + e.getClickCount() + ")", e);
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			display("Mouse released (# of clicks: " + e.getClickCount() + ")", e);
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			display("Mouse entered", e);
		}
		@Override
		public void mouseExited(MouseEvent e) {
			display("Mouse exited", e);
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			display("Mouse clicked (# of clicks: " + e.getClickCount() + ")", e);
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			display("Mouse dragged", e);
		}
		@Override
		public void mouseMoved(MouseEvent e) {
			display("Mouse moved", e);
		}
		
		protected void display(String s, MouseEvent e) {
			System.out.println(s + " X=" + e.getX() + " Y=" + e.getY());
		}
		
	}
	
	
}

public class MouseEventTest {

	public static void main(String[] args) {
		new MyFrame();
	}

}
