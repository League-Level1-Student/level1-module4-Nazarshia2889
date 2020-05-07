package _08_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class calculator {
	int x;
	int y;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addition = new JButton();
	JButton subtraction = new JButton();
	JButton multiplication = new JButton();
	JButton division = new JButton();
	
	
	void run() {
		frame.setVisible(true);
		frame.setTitle("Calculator");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(addition);
		panel.add(subtraction);
		panel.add(multiplication);
		panel.add(division);
		
		addition.setText("Add");
		subtraction.setText("Subtract");
		multiplication.setText("Multiply");
		division.setText("Divide");
		
		
	}
	
	calculator(int firstNumber, int secondNumber){
		x = firstNumber;
		y = secondNumber;
	}
	
	public int add() {
		return x + y;
	}
	
	public int subtract() {
		return x - y;
	}
	
	public int multiply() {
		return x * y;
	}
	
	public int divide() {
		return x / y;
	}

}
