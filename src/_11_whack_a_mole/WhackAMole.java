package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button;
	JButton b;
	Random ran = new Random();
	int y = 0;

	void run() {
		setFrame(panel);
		frame.add(panel);
		drawButtons();
	}
	
	void setFrame(JPanel panel) {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setTitle("Whack a Mole");
		frame.setSize(300, 300);
	}
	
	public void drawButtons() {
		frame.remove(panel);
		panel = new JPanel();
		frame.add(panel);
		int x = ran.nextInt(24);
		for(int i = 0; i < 24; i++) {
			if(i == x) {
				b = new JButton();
				b.setText("mole!");
				panel.add(b);
				b.addActionListener(this);
			}
			else {
				button = new JButton();
				panel.add(button);
				button.addActionListener(this);
			}
		}
		setFrame(panel);
		frame.add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		drawButtons();
		
		if(buttonPressed.getText().equals("")) {
			speak("No");
			System.out.println("no");
		}
		else if(buttonPressed.getText().equals("mole!")) {
			speak("yes");
		}
		
		
		
	}
	void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
	
	
        }
	}
}
