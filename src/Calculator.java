import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
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
	public Calculator(){
		
		jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(450, 600);
		jf.setLocation(100, 200);
		
		displayLable = new JLabel("Hello");
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
		
		JButton divButton = new JButton("/");
		divButton.setBounds(310, 130, 50, 50);
		divButton.setFont(new Font("Serif", Font.BOLD, 20));
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
		
		JButton multButton = new JButton("X");
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
		
		JButton minusButton = new JButton("-");
		minusButton.setBounds(310, 310, 50, 50);
		minusButton.setFont(new Font("Serif", Font.BOLD, 20));
		jf.add(minusButton);
		
		//fourth line
		JButton dotButton = new JButton(".");
		dotButton.setBounds(40, 400, 50, 50);
		dotButton.setFont(new Font("Serif", Font.BOLD, 20));
		jf.add(dotButton);
		
		
		zeroButton = new JButton("0");
		zeroButton.setBounds(130, 400, 50, 50);
		zeroButton.setFont(new Font("Serif", Font.BOLD, 20));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		
		JButton eqltoButton = new JButton("=");
		eqltoButton.setBounds(220, 400, 50, 50);
		eqltoButton.setFont(new Font("Serif", Font.BOLD, 15));
		jf.add(eqltoButton);
		
		JButton plusButton = new JButton("+");
		plusButton.setBounds(310, 400, 50, 50);
		plusButton.setFont(new Font("Serif", Font.BOLD, 15));
		jf.add(plusButton);
		
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String ar[]) {
		
		 new Calculator();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			displayLable.setText("7");
			}else if(e.getSource() == eightButton) {
				displayLable.setText("8");
				
			}else if(e.getSource()== nineButton) {
				displayLable.setText("9");
			}else if(e.getSource() == fourButton) {
				displayLable.setText("4");
				
			}else if(e.getSource()== fiveButton) {
				displayLable.setText("5");
			}else if(e.getSource() == sixButton) {
				displayLable.setText("6");
				
			}else if(e.getSource()== oneButton) {
				displayLable.setText("1");
			}else if(e.getSource() == twoButton) {
				displayLable.setText("2");
				
			}else if(e.getSource()== threeButton) {
				displayLable.setText("3");
			}else if(e.getSource()== zeroButton) {
				displayLable.setText("0");
			}
	
	
		
		
	}
	

}
