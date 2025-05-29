import javax.swing.JPanel;

public class GameScreen extends JPanel {
    private Game game;

    public GameScreen(Game game){

        this.game = game;




    }
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
}
