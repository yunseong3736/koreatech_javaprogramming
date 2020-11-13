package myframetest2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {
	public MyFrame() {
		super("Test");
		Toolkit kit = Toolkit.getDefaultToolkit();
		//graphic ���� �ڿ� ���� ����
		Dimension screenSize = kit.getScreenSize();
		//ȭ�� ũ�� ��ȯ(width, height);
		System.out.println(screenSize.width + ", " + screenSize.height);
		
		setSize(300, 200);
		setLocation(screenSize.width / 2, screenSize.height / 2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My Frame");
		
		Image img = kit.getImage("mystery.jpg");
		setIconImage(img);
		
		setLayout(new FlowLayout());
		JButton button = new JButton("Button");
		this.add(button);
		
		setResizable(false); // ũ�� ���� ����
		setVisible(true);
	}
}

public class MyFrameTest2 {

	public static void main(String[] args) {

		MyFrame f = new MyFrame();

	}

}
