package SnowManFace;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel{
	JButton button;
	Color color = new Color(0, 255, 0);
	ActionListener listener = new ActionListener();
	int s = 180;
	
	public MyPanel() {
		this.setLayout(new BorderLayout());
		button = new JButton("Ç¥Á¤ ¹× »ö±ò º¯°æ");
		button.addActionListener(this);
		button.setBackground(Color.DARK_GRAY);
		add(button, BorderLayout.NORTH);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(color);
		g.fillOval(20,30,210,200);
		g.setColor(Color.black);
		g.drawArc(60,80,50,50,180, -this.s);
		g.drawArc(150, 80, 50, 50, 180, -this.s);
		g.drawArc(70, 130, 100, 70, 180, this.s);
	}
	
	public void actionPerformed(ActionEvent e) {
		s = -s;
		color = new Color((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255));
		repaint();
	}
}

public class SnowManFace2 extends JFrame{

	public SnowManFace2() {
		this.setTitle("Âî¸ð±â");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(280, 300);
		this.add(new MyPanel());
		this.setVisible(true);
	}
	
	public static void main(String[] args) {

		new SnowManFace();

	}

}
