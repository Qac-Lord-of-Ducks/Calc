/**
 * @author Zac Hallman
 * @version #1 
 * @date 10/8/2016
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class JFrame_Calc extends JFrame {

	private JPanel contentPane;
	private static String input = "";
	private static double answer = 0;
	private static int r,g,b;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame_Calc frame = new JFrame_Calc();
					frame.setTitle("Calculator");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrame_Calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 281, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel answerLabel = new JLabel("                          ");
		answerLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(answerLabel);
		
		/**
		 * Creates panel for number buttons
		 */
		JPanel Num_Panel = new JPanel();
		contentPane.add(Num_Panel, BorderLayout.CENTER);
		Num_Panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton num_7 = new JButton(" 7 ");
		num_7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Num_Panel.add(num_7);
		 num_7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += "7";
				answerLabel.setText(String.valueOf(input));
				r = (int) (Math.random()*255);
				g = (int) (Math.random()*255);
				b = (int) (Math.random()*255);
				num_7.setBackground(new Color(r,g,b));
			}
		});
		
		JButton num_8 = new JButton(" 8 ");
		num_8.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Num_Panel.add(num_8);
		num_8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += "8";
				answerLabel.setText(String.valueOf(input));
				r = (int) (Math.random()*255);
				g = (int) (Math.random()*255);
				b = (int) (Math.random()*255);
				num_8.setBackground(new Color(r,g,b));
			}
		});
		
		JButton num_9 = new JButton(" 9 ");
		num_9.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Num_Panel.add(num_9);
		num_9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += "9";
				answerLabel.setText(String.valueOf(input));
				r = (int) (Math.random()*255);
				g = (int) (Math.random()*255);
				b = (int) (Math.random()*255);
				num_9.setBackground(new Color(r,g,b));
			}
		});
		
		JButton num_4 = new JButton(" 4 ");
		num_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Num_Panel.add(num_4);
		num_4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += "4";
				answerLabel.setText(String.valueOf(input));
				r = (int) (Math.random()*255);
				g = (int) (Math.random()*255);
				b = (int) (Math.random()*255);
				num_4.setBackground(new Color(r,g,b));		   
			}
		});
		
		
		JButton num_5 = new JButton(" 5 ");
		num_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Num_Panel.add(num_5);
		num_5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += "5";
				answerLabel.setText(String.valueOf(input));
				r = (int) (Math.random()*255);
				g = (int) (Math.random()*255);
				b = (int) (Math.random()*255);
				num_5.setBackground(new Color(r,g,b));
			}
		});
		JButton num_6 = new JButton(" 6 ");
		num_6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Num_Panel.add(num_6);
		num_6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += "6";
				answerLabel.setText(String.valueOf(input));
				r = (int) (Math.random()*255);
				g = (int) (Math.random()*255);
				b = (int) (Math.random()*255);
				num_6.setBackground(new Color(r,g,b));
			}
		});
		
		JButton num_1 = new JButton(" 1 ");
		num_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Num_Panel.add(num_1);
		num_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += "1";
				answerLabel.setText(String.valueOf(input));
				r = (int) (Math.random()*255);
				g = (int) (Math.random()*255);
				b = (int) (Math.random()*255);
				num_1.setBackground(new Color(r,g,b));
			}
		});
		
		JButton num_2 = new JButton(" 2 ");
		num_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Num_Panel.add(num_2);
		num_2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += "2";
				answerLabel.setText(String.valueOf(input));
				r = (int) (Math.random()*255);
				g = (int) (Math.random()*255);
				b = (int) (Math.random()*255);
				num_2.setBackground(new Color(r,g,b));
			}
		});
		
		JButton num_3 = new JButton(" 3 ");
		num_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Num_Panel.add(num_3);
		num_3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += "3";
				answerLabel.setText(String.valueOf(input));
				r = (int) (Math.random()*255);
				g = (int) (Math.random()*255);
				b = (int) (Math.random()*255);
				num_3.setBackground(new Color(r,g,b));
			}
		});
		
		JButton clear = new JButton("CE");
		clear.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Num_Panel.add(clear);
		clear.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input = "";
				answer = 0;
				answerLabel.setText(String.valueOf(input));
				r = (int) (Math.random()*255);
				g = (int) (Math.random()*255);
				b = (int) (Math.random()*255);
				clear.setBackground(new Color(r,g,b));
			}
		});
		
		JButton num_0 = new JButton(" 0 ");
		num_0.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Num_Panel.add(num_0);
		num_0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += "0";
				answerLabel.setText(String.valueOf(input));
				r = (int) (Math.random()*255);
				g = (int) (Math.random()*255);
				b = (int) (Math.random()*255);
				num_0.setBackground(new Color(r,g,b));
			}
		});		
		
		JButton dPoint = new JButton(" . ");
		dPoint.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Num_Panel.add(dPoint);
		dPoint.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += ".";
				answerLabel.setText(String.valueOf(input));
				r = (int) (Math.random()*255);
				g = (int) (Math.random()*255);
				b = (int) (Math.random()*255);
				dPoint.setBackground(new Color(r,g,b));
			}
		});		
		
		/**
		 * Creates panel for operation buttons
		 */
		JPanel Op_Panel = new JPanel();
		contentPane.add(Op_Panel, BorderLayout.EAST);
		Op_Panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton divide = new JButton("   /   ");
		divide.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Op_Panel.add(divide);
		divide.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += " / ";
				answerLabel.setText(String.valueOf(input));
				r = (int) (Math.random()*255);
				g = (int) (Math.random()*255);
				b = (int) (Math.random()*255);
				divide.setBackground(new Color(r,g,b));
			}
		});
	
		
		JButton multiply = new JButton(" * ");
		multiply.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Op_Panel.add(multiply);
		multiply.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += " * ";
				answerLabel.setText(String.valueOf(input));
				r = (int) (Math.random()*255);
				g = (int) (Math.random()*255);
				b = (int) (Math.random()*255);
				multiply.setBackground(new Color(r,g,b));
			}
		});
		
		JButton subtract = new JButton(" - ");
		subtract.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Op_Panel.add(subtract);
		subtract.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += " - ";
				answerLabel.setText(String.valueOf(input));
				r = (int) (Math.random()*255);
				g = (int) (Math.random()*255);
				b = (int) (Math.random()*255);
				subtract.setBackground(new Color(r,g,b));
			}
		});
		
		JButton add = new JButton(" + ");
		add.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Op_Panel.add(add);
		 add.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					input += " + ";
					answerLabel.setText(String.valueOf(input));
					r = (int) (Math.random()*255);
					g = (int) (Math.random()*255);
					b = (int) (Math.random()*255);
					add.setBackground(new Color(r,g,b));
				}
			});
		
		JButton equals = new JButton("=");
		equals.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Op_Panel.add(equals);
		equals.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				r = (int) (Math.random()*255);
				g = (int) (Math.random()*255);
				b = (int) (Math.random()*255);
				equals.setBackground(new Color(r,g,b));
				String[] array = input.split(" ");
				
				String nextOp = "";
				for (String string : array) {
					
					try {
						double d = Double.parseDouble(string);
						
						if (nextOp.equals("+")) {
							answer += d;
						} else if (nextOp.equals("-")) {
							answer -= d;
						} else if (nextOp.equals("/")) {
							answer /= d;
						} else if (nextOp.equals("*")) {
							answer *= d;
						} else {
							answer = d;
						}
						
					} catch (Exception e) {
						if (string.equals("+")
								|| string.equals("-")
								|| string.equals("/")
								|| string.equals("*")) {
							nextOp = string;
						}
						else {
							JOptionPane.showMessageDialog(null, "Error");
							setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						}
					}
					
				}
			}
		});
	}

}
