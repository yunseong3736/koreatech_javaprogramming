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
		
		// 이렇게 하면 텍스트 필드에 아무리 쳐도 출력이 안됨. 이벤트 처리를 해야한다.
		// 이것을 이벤트 핸들링이라고 한다.
		System.out.println(t1.getText());
	}
}

public class myframetest5 {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
	
}
