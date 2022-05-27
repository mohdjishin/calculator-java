import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	boolean  isOperatorClicked = false;
	JFrame jf;
	JLabel displayLable ;
	JButton sevenButton;
	JButton eightButton ;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton ;
	JButton zeroButton;
	String oldValue;
	int option;
	float res;
	
	JButton divButton;
	JButton multButton ;
	JButton minusButton ;
	JButton dotButton;
	JButton eqltoButton;
	JButton plusButton ;
	JButton clearButton ;
	public Calculator(){
		
		jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(450, 600);
		jf.setLocation(100, 200);
		
		displayLable = new JLabel();
		displayLable.setBounds(30, 50, 370, 40);
		displayLable.setBackground(Color.gray);
		displayLable.setOpaque(true);
		displayLable.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLable.setForeground(Color.white);
		jf.add(displayLable);
		
		//buttons....
		sevenButton = new JButton("7");
		sevenButton.setBounds(40, 130, 50, 50);
		sevenButton.setFont(new Font("Serif", Font.BOLD, 20));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		
		eightButton = new JButton("8");
		eightButton.setBounds(130, 130, 50, 50);
		eightButton.setFont(new Font("Serif", Font.BOLD, 20));
		eightButton.addActionListener(this);
		
		jf.add(eightButton);
		
		
		nineButton = new JButton("9");
		nineButton.setBounds(220, 130, 50, 50);
		nineButton.setFont(new Font("Serif", Font.BOLD, 20));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		divButton = new JButton("/");
		divButton.setBounds(310, 130, 50, 50);
		divButton.setFont(new Font("Serif", Font.BOLD, 20));
		divButton.addActionListener(this);
		jf.add(divButton);
		
		// second line
		
		fourButton = new JButton("4");
		fourButton.setBounds(40, 220, 50, 50);
		fourButton.setFont(new Font("Serif", Font.BOLD, 20));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		
		fiveButton = new JButton("5");
		fiveButton.setBounds(130, 220, 50, 50);
		fiveButton.setFont(new Font("Serif", Font.BOLD, 20));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		
		sixButton = new JButton("6");
		sixButton.setBounds(220, 220, 50, 50);
		sixButton.setFont(new Font("Serif", Font.BOLD, 20));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		multButton = new JButton("X");
		multButton.setBounds(310, 220, 50, 50);
		multButton.setFont(new Font("Serif", Font.BOLD, 20));
		jf.add(multButton);
		
		// third line..
		oneButton = new JButton("1");
		oneButton.setBounds(40, 310, 50, 50);
		oneButton.setFont(new Font("Serif", Font.BOLD, 20));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		
		twoButton = new JButton("2");
		twoButton.setBounds(130, 310, 50, 50);
		twoButton.setFont(new Font("Serif", Font.BOLD, 20));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		
		threeButton = new JButton("3");
		threeButton.setBounds(220, 310, 50, 50);
		threeButton.setFont(new Font("Serif", Font.BOLD, 20));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		minusButton = new JButton("-");
		minusButton.setBounds(310, 310, 50, 50);
		minusButton.setFont(new Font("Serif", Font.BOLD, 20));
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		//fourth line
		dotButton = new JButton(".");
		dotButton.setBounds(40, 400, 50, 50);
		dotButton.setFont(new Font("Serif", Font.BOLD, 20));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		
		zeroButton = new JButton("0");
		zeroButton.setBounds(130, 400, 50, 50);
		zeroButton.setFont(new Font("Serif", Font.BOLD, 20));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		
		eqltoButton = new JButton("=");
		eqltoButton.setBounds(220, 400, 50, 50);
		eqltoButton.setFont(new Font("Serif", Font.BOLD, 15));
		eqltoButton.addActionListener(this);
		jf.add(eqltoButton);
		
		plusButton = new JButton("+");
		plusButton.setBounds(310, 400, 50, 50);
		plusButton.setFont(new Font("Serif", Font.BOLD, 15));
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		
		clearButton = new JButton("C");
		clearButton.setBounds(390, 400, 50, 50);
		clearButton.setFont(new Font("Serif", Font.BOLD, 15));
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String ar[]) {
		
		 new Calculator();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			if(isOperatorClicked == true) {
				
				displayLable.setText("7");
				isOperatorClicked = false;
				
			}else {
			displayLable.setText(displayLable.getText()+"7");
			}
		}else if(e.getSource() == eightButton) {
			
			if(isOperatorClicked == true) {
				
				displayLable.setText("8");
				isOperatorClicked = false;
				
			}else {
			displayLable.setText(displayLable.getText()+"8");
			}
		}else if(e.getSource()== nineButton) {
			if(isOperatorClicked == true) {
				
				displayLable.setText("9");
				isOperatorClicked = false;
				
			}else {
			displayLable.setText(displayLable.getText()+"9");
			}
			
		}else if(e.getSource() == fourButton) {
		
			if(isOperatorClicked == true) {
				
				displayLable.setText("4");
				isOperatorClicked = false;
				
			}else {
			displayLable.setText(displayLable.getText()+"4");
			}
			
				
			}else if(e.getSource()== fiveButton) {
			
				if(isOperatorClicked == true) {
					
					displayLable.setText("5");
					isOperatorClicked = false;
					
				}else {
				displayLable.setText(displayLable.getText()+"5");
				}
				
			}else if(e.getSource() == sixButton) {
				
				if(isOperatorClicked == true) {
					
					displayLable.setText("6");
					isOperatorClicked = false;
					
				}else {
				displayLable.setText(displayLable.getText()+"6");
				}
				
				
			}else if(e.getSource()== oneButton) {
				
				if(isOperatorClicked == true) {
					
					displayLable.setText("1");
					isOperatorClicked = false;
					
				}else {
				displayLable.setText(displayLable.getText()+"1");
				}
				
			}else if(e.getSource() == twoButton) {
				
				if(isOperatorClicked == true) {
					
					displayLable.setText("2");
					isOperatorClicked = false;
					
				}else {
				displayLable.setText(displayLable.getText()+"2");
				}
				
				
			}else if(e.getSource()== threeButton) {
				
				if(isOperatorClicked == true) {
					
					displayLable.setText("3");
					isOperatorClicked = false;
					
				}else {
				displayLable.setText(displayLable.getText()+"3");
				}
				
			}else if(e.getSource()== zeroButton) {
				
				if(isOperatorClicked == true) {
					
					displayLable.setText("0");
					isOperatorClicked = false;
					
				}else {
				displayLable.setText(displayLable.getText()+"0");
				}
				
			}
			else if(e.getSource()==divButton) {
				option = 4;
				isOperatorClicked = true;
				
				oldValue = displayLable.getText();
				
				
			}else if(e.getSource()==multButton) {
				option = 3;
				isOperatorClicked = true;
				
				oldValue = displayLable.getText();
				
			}else if(e.getSource()==minusButton) {
				
				option = 2;
				isOperatorClicked = true;
				
				oldValue = displayLable.getText();
				
				
			}else if(e.getSource()==dotButton) {
				displayLable.setText(displayLable.getText()+".");
				
			}else if(e.getSource()==eqltoButton) {
				
				
				String newValue = displayLable.getText();
				float oldValueF = Float.parseFloat(oldValue);
				float newValueF =Float.parseFloat(newValue);
				
				if(option ==1) {
					res  = oldValueF +newValueF;
				}else if(option ==2) {
					res = oldValueF - newValueF;
				}else if(option ==3) {
					res = (oldValueF * newValueF);
				}else if(option ==4) {
					res = oldValueF / newValueF;
				}
				
				displayLable.setText(res+"");
				
				
			}else if(e.getSource()==plusButton) {
				option = 1;
				isOperatorClicked = true;
				
				oldValue = displayLable.getText();
				
			}else if(e.getSource()==clearButton) {
				displayLable.setText("");
			}
	
	
		
		
		
		
		
		
	}
	

}
