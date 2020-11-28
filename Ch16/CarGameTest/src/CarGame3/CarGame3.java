package CarGame3;
//p416
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	BufferedImage img = null;
	int img_x = 100, img_y = 100;
	
	public MyPanel() {
		try {
			img = ImageIO.read(new File("car.gif"));
		}catch(IOException e) {
			System.out.println("No image");
			System.exit(1);
		}
		
		addMouseListener(new MyMouseListener());
		addMouseMotionListener(new MyMouseListener());
		this.requestFocus();
		this.setFocusable(true);
		
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
	
	//No need to realize unnecessary Methods of interfaces by using Adapter
	private class MyMouseListener extends MouseAdapter{
		
		//In MouseListener interface
		@Override
		public void mousePressed(MouseEvent e) {
			img_x = e.getX();
			img_y = e.getY();
			repaint();
		}
		
		//In MouseMotionListener Interface
		@Override
		public void mouseDragged(MouseEvent e) {
			img_x = e.getX();
			img_y = e.getY();
			if (img_x + 257> 600) img_x = 600-257;
			else if (img_x < 0) img_x = 0;
			if (img_y + 183> 600) img_y = 600-183;
			else if (img_y < 0) img_y = 0;
			
			repaint();
		}
	}
}

public class CarGame3 extends JFrame{

	public CarGame3() {
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new MyPanel());
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new CarGame3();
	}

}
