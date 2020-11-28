package KeyEventTest;
//p405
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
		tf.addKeyListener(new MyListener());
		pw.addActionListener(new MyListener());
		pw.addKeyListener(new MyListener());
		pw.setEchoChar('*');
		JPanel panel = new JPanel();
		panel.add(tf);
		panel.add(pw);
		this.add(panel);
		this.setVisible(true);
		this.pack();
	}
	
	private class MyListener implements ActionListener, KeyListener{
		//ActionListener Override
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == tf) {
				System.out.println(tf.getText());
				tf.setText("Text entered");
			}
			else if (e.getSource() == pw) {
				System.out.println(pw.getPassword());
			}
		}
		
		
		//KeyListener Override
		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("Keypressed");
			System.out.println(e.getKeyChar());
			System.out.println(KeyEvent.getKeyText(e.getKeyCode()));
		}
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("KeyReleased");
			System.out.println(e.getKeyChar());
		}
		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println("KeyTyped");
			System.out.println(e.getKeyChar());
		}
		
	}
}

public class KeyEventTest {

	public static void main(String[] args) {
		new MyFrame();
	}

}
