package ButtonActionTest2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

//무명 클래스를 이용한 방법
class MyFrame extends JFrame {
	private JButton b1, b2;
	private JTextField tf;
	
	public MyFrame() {
		this.setTitle("Button Test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,200);
		
		b1 = new JButton("Button 1");
		b2 = new JButton("Button 2");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Button 1 Clicked");
				System.out.println("Button 1 Clicked");
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Button 2 Clicked");
				System.out.println("Button 2 Clicked");
			}
		});
		tf = new JTextField(20);
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		p.add(tf);
		this.add(p);
		this.setVisible(true);
		this.pack();
	}
}

public class ButtonActionTest2 {

	public static void main(String[] args) {
		new MyFrame();
	}

}
