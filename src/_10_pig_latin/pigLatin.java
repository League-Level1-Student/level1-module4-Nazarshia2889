package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pigLatin implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField text = new JTextField(10);
	JTextField field = new JTextField(10);
	PigLatinTranslator pig = new PigLatinTranslator();

	
	void run() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setTitle("Translator to Pig Latin");
		frame.add(panel);
		
		panel.add(text);
		panel.add(button);
		panel.add(field);
		
		field.setEditable(false);
		
		button.setText("Translate");
		button.addActionListener(this);
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		
		String x = text.getText();
		
		if(buttonPressed == button) {
			String y = pig.translate(x);
			field.setText(y);
		}
		
	}
	

}
