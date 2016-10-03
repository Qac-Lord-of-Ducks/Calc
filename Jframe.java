import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jframe 
{
	private static int firstvalue;
	private static int secondvalue;
	private static double answer;
	
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
				firstvalue = 1;
			}
		});
		JButton num1_2 = new JButton("2");
		thingy.add(num1_2);
		num1_2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				firstvalue = 2;
			}
		});
		
		JButton num1_3 = new JButton("3");
		thingy.add(num1_3);
		num1_3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				firstvalue = 3;
			}
		});
		JButton num1_4 = new JButton("4");
		thingy.add(num1_4);
		num1_4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				firstvalue = 4;
			}
		});
		JButton num1_5 = new JButton("5");
		thingy.add(num1_5);
		num1_5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				firstvalue = 5;
			}
		});
		JButton num1_6 = new JButton("6");
		thingy.add(num1_6);
		num1_6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				firstvalue = 6;
			}
		});
		
		JButton num1_7 = new JButton("7");
		thingy.add(num1_7);
		num1_7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				firstvalue = 7;
			}
		});
		
		JButton num1_8 = new JButton("8");
		thingy.add(num1_8);
		num1_8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				firstvalue = 8;
			}
		});
		
		JButton num1_9 = new JButton("9");
		thingy.add(num1_9);
		num1_9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				firstvalue = 9;
			}
		});
		
		JButton num1_0 = new JButton("0");
		thingy.add(num1_0);
		num1_0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				firstvalue = 0;
			}
		});		
		
			JButton num2_1 = new JButton("1");
			thingy.add(num2_1);
			num2_1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					secondvalue = 1;
				}
			});
			JButton num2_2 = new JButton("2");
			thingy.add(num2_2);
			num2_2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					secondvalue = 2;
				}
			});
			
			JButton num2_3 = new JButton("3");
			thingy.add(num2_3);
			num2_3.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					secondvalue = 3;
				}
			});
			JButton num2_4 = new JButton("4");
			thingy.add(num2_4);
			num2_4.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					secondvalue = 4;
				}
			});
			JButton num2_5 = new JButton("5");
			thingy.add(num2_5);
			num2_5.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					secondvalue = 5;
				}
			});
			JButton num2_6 = new JButton("6");
			thingy.add(num2_6);
			num2_6.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					secondvalue = 6;
				}
			});
			
			JButton num2_7 = new JButton("7");
			thingy.add(num2_7);
			num2_7.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					secondvalue = 7;
				}
			});
			
			JButton num2_8 = new JButton("8");
			thingy.add(num2_8);
			num2_8.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					secondvalue = 8;
				}
			});
			
			JButton num2_9 = new JButton("9");
			thingy.add(num2_9);
			num2_9.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					secondvalue = 9;
				}
			});
			
			JButton num2_0 = new JButton("0");
			thingy.add(num2_0);
			num2_0.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					secondvalue = 0;
				}
			});	
		
		JButton add = new JButton("+");
		thingy.add(add);
		add.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				answer = firstvalue + secondvalue;
			}
		});
		JButton subtract = new JButton("-");
		thingy.add(subtract);
		subtract.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				answer = firstvalue - secondvalue;
			}
		});
		JButton divide = new JButton("/");
		thingy.add(divide);
		divide.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				answer = firstvalue / secondvalue;
			}
		});
	
		JButton multiply = new JButton("*");
		thingy.add(multiply);
		multiply.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				answer = firstvalue * secondvalue;;
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
	}
}
