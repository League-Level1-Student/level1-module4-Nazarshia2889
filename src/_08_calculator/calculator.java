package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements ActionListener {
	int x;
	int y;
	JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();
	
	JButton addition = new JButton();
	JButton subtraction = new JButton();
	JButton multiplication = new JButton();
	JButton division = new JButton();
	
	JTextField one = new JTextField(10);
	JTextField two = new JTextField(10);
	
	
	
	JLabel l = new JLabel();
	
	
	
	
	void run() {
		frame.setVisible(true);
		frame.setTitle("Calculator");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setSize(350, 300);
		
		
		panel.add(one);
		panel.add(two);
		panel.add(addition);
		panel.add(subtraction);
		panel.add(multiplication);
		panel.add(division);
		panel.add(l);
		
		l.setText("");
		
		
	
		addition.setText("Add");
		subtraction.setText("Subtract");
		multiplication.setText("Multiply");
		division.setText("Divide");
		
		addition.addActionListener(this);
		subtraction.addActionListener(this);
		multiplication.addActionListener(this);
		division.addActionListener(this);
		
		
		
		
		
		
	}
	
	
	
	public int add(int x, int  y) {
		return x + y;
	}
	
	public int subtract(int x, int y) {
		return x - y;
	}
	
	public int multiply(int x, int y) {
		return x * y;
	}
	
	public int divide(int x, int y) {
		return x / y;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		String first = one.getText();
		String second = two.getText();
		int numberOne = Integer.parseInt(first);
		int numberTwo = Integer.parseInt(second);
		
		if(buttonPressed == addition) {
			int resultOne = add(numberOne, numberTwo);
			l.setSize(100, 100);
			l.setText(resultOne + "");
			
		}
		else if(buttonPressed == subtraction) {
			int resultTwo = subtract(numberOne, numberTwo);
			l.setSize(100, 100);
			l.setText(resultTwo + "");
			
		}
		else if(buttonPressed == multiplication) {
			int resultThree = multiply(numberOne, numberTwo);
			l.setSize(100, 100);
			l.setText(resultThree + "");
			
		}
		else if(buttonPressed == division) {
			int resultFour = divide(numberOne, numberTwo);
			l.setSize(100, 100);
			l.setText(resultFour + "");
			
		}
		else {
			l.setSize(100, 100);
			l.setText("Error!");
		}
		
	}

}
