package TrafficLight;
//p408
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel{
	boolean flag = false;
	private int light_number = 0;
	
	public MyPanel() {
		this.setLayout(new BorderLayout());
		JButton b = new JButton("traffic light turn on");
		b.addActionListener(new MyListener());
		this.add(b, BorderLayout.SOUTH);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawOval(100, 100, 100, 100);
		g.drawOval(100, 200, 100, 100);
		g.drawOval(100, 300, 100, 100);
		
		if(this.light_number == 0) {
			g.setColor(Color.red);
			g.fillOval(100, 100, 100, 100);
		}
		else if(this.light_number == 1) {
			g.setColor(Color.green);
			g.fillOval(100, 200, 100, 100);
		}
		else {
			g.setColor(Color.yellow);
			g.fillOval(100, 300, 100, 100);
		}
		
	}
	
	private class MyListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			++light_number;
			light_number %= 3;
			repaint();
		}
	}
}

public class TrafficLight extends JFrame{

	public TrafficLight() {
		this.setSize(300,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new MyPanel());
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new TrafficLight();
	}

}
