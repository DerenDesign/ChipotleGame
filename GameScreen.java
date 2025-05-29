import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import java.awt.event.MouseListener;

public class GameScreen extends JPanel implements MouseListener {
    private Game game;

    public GameScreen(Game game){

        this.game = game;


	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Not implemented
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Not implemented
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Not implemented
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Not implemented
	}

    @Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
        
		//No Rice
		if(x > 442 && x < 496 && y > 578 && y < 606) {
			System.out.println("No Rice");
		}
		//Black Beans
		if(x > 371 && x < 430 && y > 545 && y < 573) {
			System.out.println("Black Beans");
		}
		//Pinto Beans
		if(x > 308 && x < 362 && y > 547 && y < 573) {
			System.out.println("Pinto Beans");
		}
		//Veggies
		if(x > 374 && x < 430 && y > 578 && y < 610) {
			System.out.println("Veggies");
		}
		//Beef Barbocoa
		if(x > 308 && x < 362 && y > 579 && y < 609) {
			System.out.println("Beef Barbocoa");
		}
		
		//Chicken
		if(x > 239 && x < 291 && y > 546 && y < 572) {
			System.out.println("Chicken");
		}
		//Sofritas
		if(x > 239 && x < 293 && y > 582 && y < 604) {
			System.out.println("Sofritas");
		}
		//Carnitas
		if(x > 238 && x < 291 && y > 610 && y < 639) {
			System.out.println("Carnitas");
		}
		//Mild
		if(x > 180 && x < 210 && y > 551 && y < 605) {
			System.out.println("Mild");
		}
		//Spicy1
		if(x > 150 && x < 177 && y > 578 && y < 605) {
			System.out.println("Spicy1");
		}
		//Spicy2
		if(x > 147 && x < 177 && y > 550 && y < 574) {
			System.out.println("Spicy2");
		}
		//Corn
		if(x > 118 && x < 145 && y > 580 && y < 604) {
			System.out.println("Corn");
		}
		//Sour Cream
		if(x > 116 && x < 145 && y > 551 && y < 576) {
			System.out.println("Sour Cream");
		}
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
}
