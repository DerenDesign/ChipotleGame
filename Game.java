import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel {
    private JFrame frame;
    private JPanel currentScreen;


    public Game() {
        frame = new JFrame("Chipotle Vault");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 750);
        frame.setLayout(null);
    
       

    }

    public void startGame() {
        setScreen(new HomeScreen(this));
                frame.setVisible(true);
            }
        
    void setScreen(JPanel screen) {
        if (currentScreen != null) {
            frame.remove(currentScreen);
        }
        currentScreen = screen;
        frame.add(currentScreen);
        frame.revalidate();
        frame.repaint();
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JPanel getCurrentScreen() {
        return currentScreen;
    }

    public void setCurrentScreen(JPanel currentScreen) {
        this.currentScreen = currentScreen;
    }
}
