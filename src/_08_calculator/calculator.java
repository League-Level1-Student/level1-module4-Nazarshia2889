package _08_calculator;

public class calculator {
	int x;
	int y;
	
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
