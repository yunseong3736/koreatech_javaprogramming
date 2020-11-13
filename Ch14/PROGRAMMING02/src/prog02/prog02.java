package prog02;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame extends JFrame {
	public MyFrame() {
		this.setTitle("Interest Calculator");
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(4,1));
		
		JPanel p1,p2,p3,p4;
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		
		JLabel l1 = new JLabel("Enter Principal");
		JLabel l2 = new JLabel("Enter Interest Rate");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(20);
		t3.setText("이자가 출력됩니다.");
		
		JButton b1 = new JButton("Calculate");
		
		p1.add(l1);
		p1.add(t1);
		p2.add(l2);
		p2.add(t2);
		p3.add(b1);
		p4.add(t3);
		
		this.add(p1);
		this.add(p2);
		this.add(p3);
		this.add(p4);
		
		//this.pack();
		this.setVisible(true);
		
	}
}

public class prog02 {

	public static void main(String[] args) {
		
		new MyFrame();
		
	}

}
