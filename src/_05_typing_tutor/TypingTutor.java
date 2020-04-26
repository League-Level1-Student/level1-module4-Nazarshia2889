package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TypingTutor implements KeyListener {
	char currentLetter;
	JFrame f = new JFrame();
	JLabel j = new JLabel();

	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	
	
	
	void run() {
		
		
		f.setVisible(true);
		f.setTitle("Type");
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.addKeyListener(this);
		f.add(j);
		currentLetter = generateRandomLetter();
		j.setText(currentLetter + "");
		j.setFont(j.getFont().deriveFont(28.0f));
		j.setHorizontalAlignment(JLabel.CENTER);
		
		f.pack();
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You typed: " + e.getKeyChar());
		j.setText("");
		if(e.getKeyChar() == currentLetter) {
			System.out.println("Correct");
			j.setBackground(Color.GREEN);
			
			
		}
		else {
			System.out.println("Incorrect");
			j.setBackground(Color.RED);
			
		}
		f.pack();
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		j.setText(currentLetter + "");
		j.setFont(j.getFont().deriveFont(28.0f));
		j.setHorizontalAlignment(JLabel.CENTER);
		f.pack();
		
	}
	Date timeAtStart = new Date();
    
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	    Date timeAtEnd = new Date();
	    long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	    long gameInSeconds = (gameDuration / 1000) % 60;
	    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	    int charactersPerMinute = (int) (charactersPerSecond * 60);
	    JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	} 
}
