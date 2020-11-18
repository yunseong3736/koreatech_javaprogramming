package FontTest;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	Font f;
	public MyPanel() {
		String[] fontList;
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fontList = ge.getAvailableFontFamilyNames();
		for (int i = 0; i < fontList.length; i++) {
			System.out.println(fontList[i]);
		}
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		f = new Font("Agency FB", Font.BOLD, 20);
		g.setFont(f);
		g.drawString("Font Test", 20, 50);
		
		f = new Font("ÇÑÃÊ·Ò¹ÙÅÁ", Font.BOLD | Font.ITALIC | Font.PLAIN, 20);
		g.setFont(f);
		g.drawString("ÇÑÃÊ·Ò¹ÙÅÁ", 20, 70);
	}
}

public class FontTest extends JFrame{

	public static void main(String[] args) {
		new FontTest();
	}
	
	public FontTest() {
		this.setSize(500,200);
		this.setTitle("FontTest");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new MyPanel());
		this.setVisible(true);
	}

}
