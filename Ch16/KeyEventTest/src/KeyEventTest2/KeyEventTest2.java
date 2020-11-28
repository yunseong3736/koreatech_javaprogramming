package KeyEventTest2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
		tf.addKeyListener(new MyListener());
		tf.addActionListener(new MyListener());
		pw.addKeyListener(new MyListener());
		pw.setEchoChar('*');
		JPanel panel = new JPanel();
		panel.add(tf);
		panel.add(pw);
		this.add(panel);
		this.setVisible(true);
		this.pack();
	}
	
	private class MyListener extends KeyAdapter implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == tf) {
				tf.setText("");
			}
			else if (e.getSource() == pw) {
				pw.setText("");
			}
		}
		
		//KeyAdapter Ŭ������ ��ӹ޾Ƽ� keyPressed, keyReleased, keyTyped�� ��� ������ �ʿ䰡 ����.
		//����� Ŭ������ �����̴�. (implements�� �ƴ϶� extends���� �����϶�.)
		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("Keypressed");
			System.out.println(e.getKeyChar());
			System.out.println(KeyEvent.getKeyText(e.getKeyCode()));
		}		
	}
}

public class KeyEventTest2 {

	public static void main(String[] args) {
		new MyFrame();
	}

}
