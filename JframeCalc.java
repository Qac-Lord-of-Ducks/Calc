import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

public class JframeCalc 
{
	private static int firstvalue;
	private static int secondvalue;
	private static double answer;
	private static String input;
	
	public static void main(String[] args)
	{
		JFrame memes = new JFrame();
		memes.setSize(350,400);
		memes.setTitle("Calculator");
		memes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel thingy = new JPanel();
		memes.add(thingy);
		
		memes.setVisible(true);
		thingy.setVisible(true);
		
		JButton num1_1 = new JButton("1");
		thingy.add(num1_1);
		num1_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += "1";
			}
		});
		JButton num1_2 = new JButton("2");
		thingy.add(num1_2);
		num1_2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += "2";
			}
		});
		
		JButton num1_3 = new JButton("3");
		thingy.add(num1_3);
		num1_3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += "3";;
			}
		});
		JButton num1_4 = new JButton("4");
		thingy.add(num1_4);
		num1_4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += "4";
			}
		});
		JButton num1_5 = new JButton("5");
		thingy.add(num1_5);
		num1_5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += "5";
			}
		});
		JButton num1_6 = new JButton("6");
		thingy.add(num1_6);
		num1_6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += "6";
			}
		});
		
		JButton num1_7 = new JButton("7");
		thingy.add(num1_7);
		num1_7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += "7";
			}
		});
		
		JButton num1_8 = new JButton("8");
		thingy.add(num1_8);
		num1_8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += "8";
			}
		});
		
		JButton num1_9 = new JButton("9");
		thingy.add(num1_9);
		num1_9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += "9";
			}
		});
		
		JButton num1_0 = new JButton("0");
		thingy.add(num1_0);
		num1_0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += "0";
			}
		});		
		
		JButton add = new JButton("+");
		thingy.add(add);
		add.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += " + ";
			}
		});
		
		JButton subtract = new JButton("-");
		thingy.add(subtract);
		subtract.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += " - ";
			}
		});
		
		JButton divide = new JButton("/");
		thingy.add(divide);
		divide.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += " / ";
			}
		});
	
		JButton multiply = new JButton("*");
		thingy.add(multiply);
		multiply.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				input += " * ";
			}
		});
		
		JButton equals = new JButton("=");
		thingy.add(equals);
		equals.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				System.out.println(answer);
			}
		});
		
		
		JButton clear = new JButton("CE");
		thingy.add(clear);
		clear.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				System.out.println("");
			}
		});
		clear.setBounds(50,50,100,50);
		memes.setVisible(true);
		thingy.setVisible(true);
		
		String[] array = input.split(" + ");
		String[] array1 = input.split(" - ");
		String[] array2 = input.split(" * ");
		String[] array3 = input.split(" / ");
		
		
	}
}
