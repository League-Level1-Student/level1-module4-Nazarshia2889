package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton first = new JButton();
	JButton second = new JButton();
	public static void main(String[] args) {
		ChuckleClicker c = new ChuckleClicker();
		c.makeButtons();
	}

	private void makeButtons() {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		
		
		
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.add(p);
		first.setText("joke");
		second.setText("punchline");
		p.add(first);
		p.add(second);
		first.addActionListener(this);
		second.addActionListener(this);
		f.pack();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == first) {
			JOptionPane.showMessageDialog(null, "Yesterday I saw a guy spill all his Scrabble letters on the road.");
		}
		else if(e.getSource() == second) {
			JOptionPane.showMessageDialog(null, "I asked him, 'What is the word on the street?'");
		}
		
	}

}
