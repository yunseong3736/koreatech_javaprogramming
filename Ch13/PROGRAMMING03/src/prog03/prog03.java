package prog03;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame {
	public MyFrame() {
		JFrame frame = new JFrame("�׽�Ʈ ������");
		frame.setSize(600,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label1 = new JLabel();
		label1.setText("�ڹ� ȣ�ڿ� ���� ���� ȯ���մϴ�.");
		JLabel label2 = new JLabel("�����ϼ��� �Է��ϼ���.");
		
		JPanel panel1 = new JPanel();
		panel1.add(label1);
		panel1.add(label2);
		
		JButton button1 = new JButton("1��");
		JButton button2 = new JButton("2��");
		JButton button3 = new JButton("3��");
		JButton button4 = new JButton("4��");
		JButton button5 = new JButton("5��");
		
		JPanel panel2 = new JPanel();
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		JPanel panel3 = new JPanel();
		panel3.add(panel1);
		panel3.add(panel2);
		
		frame.add(panel3);
		
		frame.setVisible(true);
	}
}

public class prog03 {

	public static void main(String[] args) {

		MyFrame f = new MyFrame();

	}

}
