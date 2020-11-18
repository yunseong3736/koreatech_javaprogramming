package PasswordTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class MyFrame extends JFrame {
	JTextField tf;
	JPasswordField pw;
	
	public MyFrame() {
		this.setSize(400, 100);
		this.setTitle("PasswordField Test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tf = new JTextField(20);
		pw = new JPasswordField(20);
		tf.addActionListener(new MyListener());
		pw.addActionListener(new MyListener());
		pw.setEchoChar('*');
		JPanel panel = new JPanel();
		panel.add(tf);
		panel.add(pw);
		this.add(panel);
		this.setVisible(true);
		this.pack();
	}
	
	private class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == tf) {
				System.out.println(tf.getText());
				tf.setText("Text entered");
			}
			else if (e.getSource() == pw) {
				System.out.println(pw.getPassword());
			}
		}
	}
}

public class PasswordTest {

	public static void main(String[] args) {
		new MyFrame();
	}

}
