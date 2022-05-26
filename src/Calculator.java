import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {
	public Calculator(){
		
		JFrame jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(450, 600);
		jf.setLocation(100, 200);
		
		JLabel displayLable = new JLabel("Hello");
		displayLable.setBounds(30, 50, 370, 40);
		displayLable.setBackground(Color.gray);
		displayLable.setOpaque(true);
		displayLable.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLable.setForeground(Color.white);
		jf.add(displayLable);
		
		//buttons....
		JButton sevenButton = new JButton("7");
		sevenButton.setBounds(40, 130, 50, 50);

		sevenButton.setFont(new Font("Serif", Font.BOLD, 20));

		jf.add(sevenButton);
		
		
		JButton eightButton = new JButton("8");
		eightButton.setBounds(130, 130, 50, 50);
		eightButton.setFont(new Font("Serif", Font.BOLD, 20));
		jf.add(eightButton);
		
		
		JButton nineButton = new JButton("9");
		nineButton.setBounds(220, 130, 50, 50);
		nineButton.setFont(new Font("Serif", Font.BOLD, 20));
		jf.add(nineButton);
		
		JButton divButton = new JButton("/");
		divButton.setBounds(310, 130, 50, 50);
		divButton.setFont(new Font("Serif", Font.BOLD, 20));
		jf.add(divButton);
		
		// second line
		
		JButton fourButton = new JButton("4");
		fourButton.setBounds(40, 220, 50, 50);
		fourButton.setFont(new Font("Serif", Font.BOLD, 20));
		jf.add(fourButton);
		
		
		JButton fiveButton = new JButton("5");
		fiveButton.setBounds(130, 220, 50, 50);
		fiveButton.setFont(new Font("Serif", Font.BOLD, 20));
		jf.add(fiveButton);
		
		
		JButton sixButton = new JButton("6");
		sixButton.setBounds(220, 220, 50, 50);
		sixButton.setFont(new Font("Serif", Font.BOLD, 20));
		jf.add(sixButton);
		
		JButton multButton = new JButton("X");
		multButton.setBounds(310, 220, 50, 50);
		multButton.setFont(new Font("Serif", Font.BOLD, 20));
		jf.add(multButton);
		
		// third line..
		JButton oneButton = new JButton("1");
		oneButton.setBounds(40, 310, 50, 50);
		oneButton.setFont(new Font("Serif", Font.BOLD, 20));
		jf.add(oneButton);
		
		
		JButton twoButton = new JButton("2");
		twoButton.setBounds(130, 310, 50, 50);
		twoButton.setFont(new Font("Serif", Font.BOLD, 20));
		jf.add(twoButton);
		
		
		JButton threeButton = new JButton("3");
		threeButton.setBounds(220, 310, 50, 50);
		threeButton.setFont(new Font("Serif", Font.BOLD, 20));
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
		
		
		JButton zeroButton = new JButton("0");
		zeroButton.setBounds(130, 400, 50, 50);
		zeroButton.setFont(new Font("Serif", Font.BOLD, 20));
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
	

}
