//Handle background, game operation

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Game implements MouseListener, ActionListener {
	public static JFrame frame;
	public boolean isPlaying = false;
	public static void main(String[] args) {
		
	
		
		frame = new JFrame("Chipotle Vault");
		frame.addMouseListener(new Game());
        frame.setSize(500, 750);  
        ImageIcon image1 = new ImageIcon("H:\\git\\ChipotleGame\\images\\Home Page.jpg");
        frame.add(new JLabel(image1));
        frame.pack();
        frame.setVisible(true);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        
		
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		
		System.out.println("X:" + x + "Y:" + y);
		//Help Button
		if(x > 155 &&  x < 360 && y > 515 && y < 625 && !isPlaying ) {
			JOptionPane.showMessageDialog(frame, "To win, you must guess the correct combination of ingredients for a Chipotle meal!\nYou only get 3 tries so make the most of it. Winners receive a BOGO chipotle code!");

			
		}
		//Start Button
		if( x > 140 && x < 390 && y > 400 && y < 475) {
			  isPlaying = true;
			  switchToGameplay();
			  randomEntree();
		}
		//White Rice
		//No Rice
		//Black Beans
		//Veggies
		//Beef Barbocoa
		//Chicken
		//Sofritas
		//Mild
		//Spicy1
		//Spicy2
		//Corn
		//Sour Cream
		//Cheese
		if(x > 88 && x < 115 && y > 553 && y < 602) {
			System.out.println("Cheese");
		}
		//Guac
		if(x > 54 && x < 82 && y > 550 && y < 603) {
			System.out.println("Guac");
		}
		//Lettuce
		if(x > 22 && x < 49 && y > 550 && y < 604) {
			System.out.println("Lettuce");
		}
		
		
		
	}

	private void randomEntree() {
		// TODO Auto-generated method stub
		int max = 3;
		int min = 1;
		int randomNumber = (int)(Math.random() * (max-min) + 1) + min;
		System.out.println(randomNumber);
		if(randomNumber == 1) {
			
			Burrito burrito = new Burrito();
			
		}
		if(randomNumber == 2) {
			BurritoBowl burritoBowl = new BurritoBowl();
			
			
		}
		if(randomNumber == 3) {
			Tacos tacos = new Tacos();
			
		}
		
	}

	private void switchToGameplay() {
		// TODO Auto-generated method stub
		frame.getContentPane().removeAll();
		frame.setLayout(null);
		
		ImageIcon gameplayImage = new ImageIcon("H:\\git\\ChipotleGame\\images\\Game Screen.png");
		JLabel background = new JLabel(gameplayImage);
		background.setBounds(0, 0, gameplayImage.getIconWidth(), gameplayImage.getIconHeight());
		
		
		ImageIcon heartImage = new ImageIcon("H:\\git\\ChipotleGame\\images\\WhiteHeart.png");
		JLabel heart = new JLabel(heartImage);
		JLabel heart2 = new JLabel(heartImage);
		JLabel heart3 = new JLabel(heartImage);
		heart.setBounds(25, 340, heartImage.getIconWidth(), heartImage.getIconHeight());
		heart2.setBounds(175, 340, heartImage.getIconWidth(), heartImage.getIconHeight());
		heart3.setBounds(325, 340, heartImage.getIconWidth(), heartImage.getIconHeight());
		background.add(heart);
		background.add(heart2);
		background.add(heart3);
		
		frame.add(background);
		frame.revalidate();
		frame.repaint();
		
		
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	} 
	
}
