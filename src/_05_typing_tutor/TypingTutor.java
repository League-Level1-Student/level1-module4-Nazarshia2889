package _05_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;

public class TypingTutor {
	char currentLetter;
	currentLetter = generateRandomLetter();

	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setTitle("Type");
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.pack();
	}
}
