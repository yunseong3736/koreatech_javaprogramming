package CalculatorTest;
//p428 PROGRAMMING No 3
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyPanel extends JPanel{
	private JPanel textPanel;
	private JPanel buttonPanel;
	private JTextField tf = new JTextField(20);
	private JButton button [] = new JButton[16];
	private String str[] = {"7","8","9","+","4","5","6","-","1","2","3","*","0","c","=","/"};
	private String equation = "";
	
	key kl = new key();
	
	public MyPanel() {
		textPanel = new JPanel();
		buttonPanel = new JPanel();
		
		this.setLayout(new BorderLayout());
		tf.addActionListener(new ButtonActionListener());
		textPanel.add(tf);
		textPanel.setBackground(new Color(125,125,125));
		buttonPanel.setLayout(new GridLayout(4, 4, 3, 3));
		addButton();

		this.add(textPanel, BorderLayout.NORTH);
		this.add(buttonPanel, BorderLayout.SOUTH);
	}
	public void addButton() {
		for (int i = 0; i < str.length; i++) {
			button[i] = new JButton(str[i]);
			button[i].setForeground(Color.blue);
			button[i].addActionListener(new ButtonActionListener());
			buttonPanel.add(button[i]);
			button[i].addKeyListener(kl);
//			button[i].requestFocus();
//			button[i].setFocusable(true);
		}
	}
	
	private class key extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keycode = e.getKeyCode();
			if (keycode == KeyEvent.VK_ENTER) {
				equation = tf.getText();
				calc_result();
			}
		}
	}
	
	private class ButtonActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == tf) {
				equation = tf.getText();
				calc_result();
				return;
			}
			String in = e.getActionCommand();
			switch (in) {
			case "+" : case "-" : case "*" : case "/" :
				equation = equation + " " + in + " ";
				tf.setText(equation);
				break;
			case "c" :
				tf.setText("");
				equation = "";
				break;
			case "=" :
				equation = tf.getText();
				calc_result();
				break;
			default :
				equation += in;
				tf.setText(equation);
				break;
			}
		}
	}
	public void calc_result() {
		String s[] = new String[3];
		String temp = equation;
		int result = 0, count = 0;
		StringTokenizer st = new StringTokenizer(equation);
		
		while(st.hasMoreTokens()) {
			s[count++] = st.nextToken();
		}
		
		int n1 = Integer.parseInt(s[0]);
		int n2 = Integer.parseInt(s[2]);
		
		switch(s[1]) {
		case "+" : result = n1 + n2; break;
		case "-" : result = n1 - n2; break;
		case "*" : result = n1 * n2; break;
		case "/" : result = n1 / n2; break;
		}
		
		tf.setText(temp + " " + "=" + " " + result);
		equation = "";
	}
}

public class CalculatorTest extends JFrame{

	public CalculatorTest() {
		this.setTitle("Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new MyPanel());
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new CalculatorTest();
	}

}
