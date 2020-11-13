package myframetest5;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame extends JFrame {
	public MyFrame() {
		setSize(500,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Test Frame");
		
		JPanel panel = new JPanel();
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		t2.setEditable(false);
		t2.setText("Not Editalble");
		
		panel.add(t1);
		panel.add(t2);
		
		add(panel);
		setVisible(true);
		
		// �̷��� �ϸ� �ؽ�Ʈ �ʵ忡 �ƹ��� �ĵ� ����� �ȵ�. �̺�Ʈ ó���� �ؾ��Ѵ�.
		// �̰��� �̺�Ʈ �ڵ鸵�̶�� �Ѵ�.
		System.out.println(t1.getText());
	}
}

public class myframetest5 {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
	
}
