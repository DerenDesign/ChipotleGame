import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HomeScreen {
	ImageIcon image1 = new ImageIcon("H:\\git\\ChipotleGame\\images\\Home Page.jpg");
	public static JFrame frame;
	public static JLabel background;
	
	public JFrame getFrame() {
		
		
		frame = new JFrame("Chipotle Vault");
		frame.addMouseListener(new Game());
        frame.setSize(500, 750);  
        ImageIcon image1 = new ImageIcon("H:\\git\\ChipotleGame\\images\\Home Page.jpg");
        frame.add(new JLabel(image1));
        frame.pack();
        frame.setVisible(true);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        return frame;
		
	}
	
}
