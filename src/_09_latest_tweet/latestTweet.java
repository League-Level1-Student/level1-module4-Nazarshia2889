package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class latestTweet implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField text = new JTextField(10);
	
	void run() { 
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setTitle("The Amazing Tweet Retriever");
		frame.add(panel);
		
		panel.add(text);
		panel.add(button);
		
		button.setText("Search the Twitterverse");
		button.addActionListener(this);
		
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		
		String x = text.getText();
		
		if(buttonPressed == button) {
			System.out.println("Tweet, Tweet");
		}
		
	}

}
