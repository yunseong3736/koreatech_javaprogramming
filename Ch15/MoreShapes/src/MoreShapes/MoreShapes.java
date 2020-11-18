package MoreShapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawRect(10, 10, 80, 80);
		
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.black);
		g2.setStroke(new BasicStroke(5));
		
		Rectangle2D r = new Rectangle2D.Double(110, 10, 80, 80);
		g2.draw(r);
		
		RoundRectangle2D rd = new RoundRectangle2D.Double(210, 10, 80, 80, 20, 20);
		System.out.println(rd.getHeight() + ", " + rd.getWidth());
		g2.draw(rd);
		
		g2.setFont(new Font("Courier", Font.BOLD, 30));
		g2.drawString("Text antialiasing", 50, 150);
	}
}

public class MoreShapes extends JFrame{

	public static void main(String[] args) {
		new MoreShapes();
	}
	
	public MoreShapes() {
		this.setSize(320,200);
		this.setTitle("MoreShapes Test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new MyPanel());
		this.setVisible(true);
	}

}
