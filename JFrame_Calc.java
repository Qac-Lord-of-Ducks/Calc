/**
 * @author Zac Hallman
 * @version #1 
 * @date 10/8/2016
 */
import java.awt.BorderLayout;
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
	static double answer = 0;
	
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
			}
		});
		
		JButton clear = new JButton("CE");
		clear.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Num_Panel.add(clear);
		clear.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input = "                ";
				answer = 0;
				answerLabel.setText(String.valueOf(input));
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
			}
		});
	
		
		JButton multiply = new JButton("*");
		multiply.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Op_Panel.add(multiply);
		multiply.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += " * ";
				answerLabel.setText(String.valueOf(input));
			}
		});
		
		JButton subtract = new JButton("-");
		subtract.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Op_Panel.add(subtract);
		subtract.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += " - ";
				answerLabel.setText(String.valueOf(input));
			}
		});
		
		JButton add = new JButton("+");
		add.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Op_Panel.add(add);
		 add.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					input += " + ";
					answerLabel.setText(String.valueOf(input));
				}
			});
		
		JButton equals = new JButton("=");
		equals.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Op_Panel.add(equals);
		equals.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				String[] shits = input.split(" "); // { "1", "+", "1" }
				
				String nextOp = "";
				for (String shit : shits) {
					
					try {
						double d = Double.parseDouble(shit);
						
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
						if (shit.equals("+")
								|| shit.equals("-")
								|| shit.equals("/")
								|| shit.equals("*")) {
							nextOp = shit;
						}
						else {
							JOptionPane.showMessageDialog(null, "Error pls try again scrublord");
					}
					
				}
				
				answerLabel.setText(String.valueOf(answer));
			}
		});
	}

}
