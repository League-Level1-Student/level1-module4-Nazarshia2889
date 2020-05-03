package _07_fortune_teller;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

public class FortuneTellerRunner {
    public static void main(String[] args) throws Exception {
      	 SwingUtilities.invokeLater(new FortuneTeller());
      	 begin();
       }
    
    static void begin() {
      	 // Welcome the user. Give them a hint for the secret location.
    	JOptionPane.showMessageDialog(null, "Welcome. Besides the ball in the middle, there's another to the right in which you use it to see.");
    	

    }
}
