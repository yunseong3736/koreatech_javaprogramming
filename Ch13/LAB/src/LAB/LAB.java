package LAB;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame {
	public MyFrame() {
		setSize(600,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel label = new JLabel("�ڹ� ���ڿ� ���Ű��� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
		panelA.add(label);
		
		JButton button1 = new JButton("�޺�����");
		JButton button2 = new JButton("������������");
		JButton button3 = new JButton("�Ұ������");
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		
		panel.add(panelA);
		panel.add(panelB);
		
		panel.setBackground(Color.BLUE);
		panelA.setBackground(Color.GREEN);
		panelB.setBackground(Color.ORANGE);
		
		add(panel);
		setVisible(true);
		
	}
}

public class LAB {

	public static void main(String[] args) {
		
		MyFrame f = new MyFrame();

	}

}
