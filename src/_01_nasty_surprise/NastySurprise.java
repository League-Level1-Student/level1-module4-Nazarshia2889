package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JButton treat = new JButton();
	JButton trick = new JButton();
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	public void run() {
		frame.setVisible(true);
		frame.add(panel);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		treat.setText("Treat");
		trick.setText("Trick");
		treat.addActionListener(this);
		trick.addActionListener(this);
		
		panel.add(treat);
		panel.add(trick);
		
		frame.pack();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		
		if(trick == buttonPressed) {
			showPictureFromTheInternet("https://www.missmalini.com/wp-content/uploads/2019/02/Golden-Retriever-Puppy.jpg");
		}
		else if(treat == buttonPressed) {
			showPictureFromTheInternet("https://www.kindpng.com/picc/m/103-1038268_not-scary-cartoon-ghost-hd-png-download.png");
		}
		
	}
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}

}
