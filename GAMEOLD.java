// //Handle background, game operation

// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.awt.event.MouseEvent;
// import java.awt.event.MouseListener;
// import java.io.File;

// import javax.imageio.ImageIO;
// import javax.swing.ImageIcon;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JOptionPane;

// public class GAMEOLD implements MouseListener, ActionListener {
// 	public static JFrame frame;
// 	public static JLabel background;
// 	private JLabel check;
// 	public boolean isPlaying = false;
// 	private ImageIcon checkMark = new ImageIcon("H:\\git\\ChipotleGame\\images\\Check.png");
// 	private ImageIcon xMark = new ImageIcon("H:\\git\\ChipotleGame\\images\\redX.png");
// 	private boolean isChecked = true;
	
	
// 	public static void main(String[] args) {
		
	
		
// 		HomeScreen home = new HomeScreen();
// 		home.getFrame();
        
        
        
		
		
		
// 	}

// 	@Override
// 	public void mouseClicked(MouseEvent e) {
// 		// TODO Auto-generated method stub
		
		
		
// 	}

// 	@Override
// 	public void mousePressed(MouseEvent e) {
// 		// TODO Auto-generated method stub
// 		int x = e.getX();
// 		int y = e.getY();
		
// 		//System.out.println("X:" + x + "Y:" + y);
// 		//Help Button
// 		if(x > 155 &&  x < 360 && y > 515 && y < 625 && !isPlaying ) {
// 			JOptionPane.showMessageDialog(frame, "To win, you must guess the correct combination of ingredients for a Chipotle meal!\nYou only get 3 tries so make the most of it. Winners receive a BOGO chipotle code!");

			
// 		}
// 		//Start Button
// 		if( x > 140 && x < 390 && y > 400 && y < 475) {
// 			  isPlaying = true;
// 			  switchToGameplay();
// 			  randomEntree();
// 		}
// 		//White Rice
// 		if(x > 444 && x < 496 && y > 547 && y < 576) {
			
// 			if(isChecked) {
// 				check.setIcon(checkMark);
				
// 			}
// 			else {
			
// 				check.setIcon(null);
// 			}
// 			isChecked = !isChecked;
// 			 frame.revalidate();
// 			    frame.repaint();
			
// 		}
// 		//No Rice
// 		if(x > 442 && x < 496 && y > 578 && y < 606) {
// 			System.out.println("No Rice");
// 		}
// 		//Black Beans
// 		if(x > 371 && x < 430 && y > 545 && y < 573) {
// 			System.out.println("Black Beans");
// 		}
// 		//Pinto Beans
// 		if(x > 308 && x < 362 && y > 547 && y < 573) {
// 			System.out.println("Pinto Beans");
// 		}
// 		//Veggies
// 		if(x > 374 && x < 430 && y > 578 && y < 610) {
// 			System.out.println("Veggies");
// 		}
// 		//Beef Barbocoa
// 		if(x > 308 && x < 362 && y > 579 && y < 609) {
// 			System.out.println("Beef Barbocoa");
// 		}
		
// 		//Chicken
// 		if(x > 239 && x < 291 && y > 546 && y < 572) {
// 			System.out.println("Chicken");
// 		}
// 		//Sofritas
// 		if(x > 239 && x < 293 && y > 582 && y < 604) {
// 			System.out.println("Sofritas");
// 		}
// 		//Carnitas
// 		if(x > 238 && x < 291 && y > 610 && y < 639) {
// 			System.out.println("Carnitas");
// 		}
// 		//Mild
// 		if(x > 180 && x < 210 && y > 551 && y < 605) {
// 			System.out.println("Mild");
// 		}
// 		//Spicy1
// 		if(x > 150 && x < 177 && y > 578 && y < 605) {
// 			System.out.println("Spicy1");
// 		}
// 		//Spicy2
// 		if(x > 147 && x < 177 && y > 550 && y < 574) {
// 			System.out.println("Spicy2");
// 		}
// 		//Corn
// 		if(x > 118 && x < 145 && y > 580 && y < 604) {
// 			System.out.println("Corn");
// 		}
// 		//Sour Cream
// 		if(x > 116 && x < 145 && y > 551 && y < 576) {
// 			System.out.println("Sour Cream");
// 		}
// 		//Cheese
// 		if(x > 88 && x < 115 && y > 553 && y < 602) {
// 			System.out.println("Cheese");
// 		}
// 		//Guac
// 		if(x > 54 && x < 82 && y > 550 && y < 603) {
// 			System.out.println("Guac");
// 		}
// 		//Lettuce
// 		if(x > 22 && x < 49 && y > 550 && y < 604) {
// 			System.out.println("Lettuce");
// 		}
		
		
		
// 	}

// 	private void randomEntree() {
// 		// TODO Auto-generated method stub
// 		int max = 3;
// 		int min = 1;
// 		int randomNumber = (int)(Math.random() * (max-min) + 1) + min;
// 		System.out.println(randomNumber);
// 		if(randomNumber == 1) {
			
// 			//Burrito burrito = new Burrito();
			
// 		}
// 		if(randomNumber == 2) {
// 			//BurritoBowl burritoBowl = new BurritoBowl();
			
			
// 		}
// 		if(randomNumber == 3) {
// 			//Tacos tacos = new Tacos();
			
// 		}
		
// 	}

// 	private void switchToGameplay() {
// 		// TODO Auto-generated method stub
// 		frame.getContentPane().removeAll();
// 		frame.setLayout(null);
		
// 		ImageIcon gameplayImage = new ImageIcon("H:\\git\\ChipotleGame\\images\\Game Screen.png");
// 		background = new JLabel(gameplayImage);
// 		background.setBounds(0, 0, gameplayImage.getIconWidth(), gameplayImage.getIconHeight());
		
		
// 		ImageIcon heartImage = new ImageIcon("H:\\git\\ChipotleGame\\images\\WhiteHeart.png");
// 		JLabel heart = new JLabel(heartImage);
// 		JLabel heart2 = new JLabel(heartImage);
// 		JLabel heart3 = new JLabel(heartImage);
// 		heart.setBounds(25, 340, heartImage.getIconWidth(), heartImage.getIconHeight());
// 		heart2.setBounds(175, 340, heartImage.getIconWidth(), heartImage.getIconHeight());
// 		heart3.setBounds(325, 340, heartImage.getIconWidth(), heartImage.getIconHeight());
// 		background.add(heart);
// 		background.add(heart2);
// 		background.add(heart3);
		
// 		check = new JLabel();
// 		check.setBounds(440, 505, checkMark.getIconWidth(), checkMark.getIconHeight());
// 		background.setLayout(null);
// 		background.add(check);
// 		frame.revalidate();
// 		frame.repaint();
		
// 		frame.add(background);
// 		frame.revalidate();
// 		frame.repaint();
		
		
		
// 	}

// 	@Override
// 	public void mouseReleased(MouseEvent e) {
// 		// TODO Auto-generated method stub
		
// 	}

// 	@Override
// 	public void mouseEntered(MouseEvent e) {
// 		// TODO Auto-generated method stub
		
// 	}

// 	@Override
// 	public void mouseExited(MouseEvent e) {
// 		// TODO Auto-generated method stub
		
// 	}

// 	@Override
// 	public void actionPerformed(ActionEvent e) {
// 		// TODO Auto-generated method stub
		
// 	} 
	
// }
