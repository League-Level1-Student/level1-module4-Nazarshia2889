package _99_extra;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mothersDay implements ActionListener, MouseListener {
	JButton one = new JButton();
	JButton  two = new JButton();
	JButton  three = new JButton();
	JButton  four = new JButton();
	JButton  five = new JButton();
	JButton  six = new JButton();
	JButton  seven = new JButton();
	JButton  eight = new JButton();
	JButton  nine = new JButton();
	JButton  ten = new JButton();
	JButton  eleven = new JButton();
	JButton  twelve = new JButton();
	JButton  thirteen = new JButton();
	JButton  fourteen = new JButton();
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	
	JButton[] buttons = {one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen};
	
	public void run() {
		frame.setVisible(true);
		frame.add(panel);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.addMouseListener(this);
		frame.setTitle("Mother's Day: Arshia Nayebnazar");
		
		one.setText("Treat");
		two.setText("Treat");
		three.setText("Treat");
		four.setText("Treat");
		five.setText("Treat");
		six.setText("Treat");
		seven.setText("Treat");
		eight.setText("Treat");
		nine.setText("Treat");
		ten.setText("Treat");
		eleven.setText("Treat");
		twelve.setText("Treat");
		thirteen.setText("Treat");
		fourteen.setText("Treat");
		
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		ten.addActionListener(this);
		eleven.addActionListener(this);
		twelve.addActionListener(this);
		thirteen.addActionListener(this);
		fourteen.addActionListener(this);
		
		panel.add(one);
		panel.add(two);
		panel.add(three);
		panel.add(four);
		panel.add(five);
		panel.add(six);
		panel.add(seven);
		panel.add(eight);
		panel.add(nine);
		panel.add(ten);
		panel.add(eleven);
		panel.add(twelve);
		panel.add(thirteen);
		panel.add(fourteen);
		
		//one.setPreferredSize(new Dimension(100, 100));
		//two.setPreferredSize(new Dimension(100, 100));
		
		panel.setLayout(null);
	    one.setBounds(325, 224, 100, 100);
	    two.setBounds(240, 224, 100, 100);
	    three.setBounds(190, 300, 100, 100);
	    four.setBounds(190, 375, 100, 100);
	    five.setBounds(220, 450, 100, 100);
	    six.setBounds(311, 514, 100, 100);
	    seven.setBounds(400, 581, 100, 100);
	    eight.setBounds(496, 514, 100, 100);
	    nine.setBounds(574, 450, 100, 100);
	    ten.setBounds(620, 375, 100, 100);
	    eleven.setBounds(620, 300, 100, 100);
	    twelve.setBounds(570, 224, 100, 100);
	    thirteen.setBounds(480, 224, 100, 100);
	    fourteen.setBounds(400, 300, 100, 100);
	    
	    for(JButton button: buttons) {
	    	button.setBackground(Color.RED);
		    button.setOpaque(true);
		    button.setBorderPainted(true);
	    }
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		
		
		if(one == buttonPressed) {
			showPictureFromTheInternet("https://www.missmalini.com/wp-content/uploads/2019/02/Golden-Retriever-Puppy.jpg");
		}
		else if(two == buttonPressed) {
			showPictureFromTheInternet("https://i.ytimg.com/vi/tH5AiDCd7PY/maxresdefault.jpg");
		}
		else if(three == buttonPressed) {
			showPictureFromTheInternet("https://d17fnq9dkz9hgj.cloudfront.net/uploads/2018/04/Pomeranian_02.jpg");
		}
		else if(four == buttonPressed) {
			showPictureFromTheInternet("https://qph.fs.quoracdn.net/main-qimg-97023c5672777c4b3076e012526e4a0f");
		}
		else if(five == buttonPressed) {
			showPictureFromTheInternet("https://s-media-cache-ak0.pinimg.com/564x/7b/c1/3a/7bc13af4a634b1e2356c98fbe63570f1.jpg");
		}
		else if(six == buttonPressed) {
			showPictureFromTheInternet("https://wallpapertag.com/wallpaper/full/f/4/3/435676-cute-dogs-and-puppies-wallpaper-1920x1440-for-tablet.jpg");
		}
		else if(seven == buttonPressed) {
			showPictureFromTheInternet("https://d17fnq9dkz9hgj.cloudfront.net/uploads/2018/04/Bulldog_02.jpg");
		}
		else if(eight == buttonPressed) {
			showPictureFromTheInternet("https://www.sheknows.com/wp-content/uploads/2018/08/fajkx3pdvvt9ax6btssg.jpeg?w=1024");
		}
		else if(nine == buttonPressed) {
			showPictureFromTheInternet("https://i.kym-cdn.com/photos/images/facebook/001/607/299/939.jpeg");
		}
		else if(ten == buttonPressed) {
			showPictureFromTheInternet("https://static.twentytwowords.com/cdn-cgi/image/width=1200,quality=85,fit=scale-down,format=auto,onerror=redirect/https://static.twentytwowords.com/wp-content/uploads/Very-Good-Dogs-That-You-Need-on-Your-Timeline_LEAD.jpg");
		}
		else if(eleven == buttonPressed) {
			showPictureFromTheInternet("https://i.imgur.com/xyPtn4m.jpg");
		}
		else if(twelve == buttonPressed) {
			showPictureFromTheInternet("https://pbs.twimg.com/media/D7dBfozUEAEkItp.jpg");
		}
		else if(thirteen == buttonPressed) {
			showPictureFromTheInternet("https://i.pinimg.com/originals/28/4e/ff/284eff9949308ebc824f074460529b9d.jpg");
		}
		else if(fourteen == buttonPressed) {
			showPictureFromTheInternet("https://static.toiimg.com/thumb/msid-69235360,width-800,height-600,resizemode-75,imgsize-701521,pt-32,y_pad-40/69235360.jpg");
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

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int mouseX = e.getX();
		int mouseY = e.getY();
		System.out.println(mouseX + " " + mouseY);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
