package _12_slot_machine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton spin = new JButton();
	JLabel cherryOne; 
	JLabel cherryTwo;
	JLabel cherryThree;
	
	JLabel limeOne;
	JLabel limeTwo;
	JLabel limeThree;
	
	JLabel orangeOne;
	JLabel orangeTwo;
	JLabel orangeThree;
	
	Random rand = new Random();
	
	
	
	
	void run() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setTitle("Slot Machine");
		frame.add(panel);
		
		panel.add(spin);
		
		
		
		try {
			cherryOne = createLabelImage("cherry.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			cherryTwo = createLabelImage("cherry.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			cherryThree = createLabelImage("cherry.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			limeOne = createLabelImage("lime.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			limeTwo = createLabelImage("lime.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			limeThree = createLabelImage("lime.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			orangeOne = createLabelImage("anotherorange.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			orangeTwo = createLabelImage("anotherorange.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			orangeThree = createLabelImage("anotherorange.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		panel.add(cherryOne);
		panel.add(limeOne);
		panel.add(orangeOne);
		
		cherryOne.setPreferredSize(new Dimension(400, 400));
		cherryTwo.setPreferredSize(new Dimension(400, 400));
		cherryThree.setPreferredSize(new Dimension(400, 400));
		
		limeOne.setPreferredSize(new Dimension(400, 400));
		limeTwo.setPreferredSize(new Dimension(400, 400));
		limeThree.setPreferredSize(new Dimension(400, 400));
		
		orangeOne.setPreferredSize(new Dimension(400, 400));
		orangeTwo.setPreferredSize(new Dimension(400, 400));
		orangeThree.setPreferredSize(new Dimension(400, 400));
	
		spin.setText("SPIN");
		spin.addActionListener(this);
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		panel.removeAll();
		panel.add(spin);
		
		int x = rand.nextInt(3);
		int y = rand.nextInt(3);
		int z = rand.nextInt(3);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		if(x == 0) {
			panel.add(cherryOne);
		}
		else if(x == 1) {
			panel.add(limeOne);
		}
		else if(x == 2) {
			panel.add(orangeOne);
		}
		
		if(y == 0) {
			panel.add(cherryTwo);
		}
		else if(y == 1) {
			panel.add(limeTwo);
		}
		else if(y == 2) {
			panel.add(orangeTwo);
		}
		
		if(z == 0) {
			panel.add(cherryThree);
		}
		else if(z == 1) {
			panel.add(limeThree);
		}
		else if(z == 2) {
			panel.add(orangeThree);
		}
		
		
		
		
		frame.pack();
		
		if(x == y && y == z) {
			JOptionPane.showMessageDialog(null, "YOU WON!");
		}
		
		
		
	}
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
    
	
}
