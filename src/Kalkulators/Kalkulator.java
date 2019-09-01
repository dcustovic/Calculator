package Kalkulators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;

public class Kalkulator {

	private JFrame frame;
	private JTextField textField;
	
	
	double fn;
	double sn;
	double result;
	String operations;
	String anwer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator window = new Kalkulator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Kalkulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 255, 384);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(8, 5, 223, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		// ----------------------------------------------------- ROW 1 --------------------------------
		
		JButton btnBS = new JButton("<");
		btnBS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			
			}
		});
		btnBS.setForeground(new Color(178, 34, 34));
		btnBS.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBS.setBounds(8, 42, 50, 50);
		frame.getContentPane().add(btnBS);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setBounds(64, 42, 50, 50);
		frame.getContentPane().add(btnC);
		
		JButton btnPerc = new JButton("%");
		btnPerc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fn = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnPerc.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPerc.setBounds(181, 42, 50, 50);
		frame.getContentPane().add(btnPerc);
		
		JButton btnPM = new JButton("±");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPM.setBounds(124, 42, 50, 50);
		frame.getContentPane().add(btnPM);
		
		// ----------------------------------------------------- ROW 2 --------------------------------
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(UIManager.getColor("Button.shadow"));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(8, 101, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(64, 101, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(124, 101, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fn = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";

			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(181, 101, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		
		// ----------------------------------------------------- ROW 3 --------------------------------
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setForeground(UIManager.getColor("Button.disabledForeground"));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(8, 162, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setForeground(UIManager.getColor("Button.disabledForeground"));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(64, 162, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setForeground(UIManager.getColor("Button.disabledForeground"));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(124, 162, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fn = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMinus.setBounds(181, 162, 50, 50);
		frame.getContentPane().add(btnMinus);
		
		// ----------------------------------------------------- ROW 4 --------------------------------
		
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setForeground(UIManager.getColor("Button.disabledForeground"));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(8, 223, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setForeground(UIManager.getColor("Button.disabledForeground"));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(64, 223, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setForeground(UIManager.getColor("Button.disabledForeground"));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(124, 223, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fn = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMult.setBounds(181, 223, 50, 50);
		frame.getContentPane().add(btnMult);
		
		
		// ----------------------------------------------------- ROW 5 --------------------------------
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btnDot.getText();
				textField.setText(EnterNumber);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(124, 284, 50, 50);
		frame.getContentPane().add(btnDot);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(64, 284, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fn = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv.setBounds(181, 284, 50, 50);
		frame.getContentPane().add(btnDiv);
		
		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String answer;
				sn = Double.parseDouble(textField.getText());
				if (operations == "+") {
					
					result = fn + sn;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				}else if (operations == "-"){
					result = fn - sn;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if (operations == "*"){
					result = fn * sn;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				}else if (operations == "/"){
					result = fn / sn;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				}else if (operations == "%"){
					result = fn % sn;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				
			}
		});
		btnEq.setForeground(new Color(34, 139, 34));
		btnEq.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEq.setBounds(8, 284, 50, 50);
		frame.getContentPane().add(btnEq);
		

		
	}
}
