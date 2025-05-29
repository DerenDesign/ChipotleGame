import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HomeScreen extends JPanel {
    private Game game;
    private JLabel background;
    private boolean isPlaying = false;

    public HomeScreen(Game game) {
        this.game = game; 
        setLayout(null);
        startUp();
    }

    private void startUp() {
       ImageIcon homeImage = new ImageIcon("images/Game Screen.png");
        
        background = new JLabel(homeImage);
        background.setBounds(0, 0, homeImage.getIconWidth(), homeImage.getIconHeight());
        
        background.setVisible(true);
        add(background);
        System.out.println("Home Screen Initialized");

        background.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                // Help Button
                if (x > 155 && x < 360 && y > 515 && y < 625 && !isPlaying) {
                    JOptionPane.showMessageDialog(game.getFrame(),
                            "To win, you must guess the correct combination of ingredients for a Chipotle meal!\n" +
                                    "You only get 3 tries so make the most of it. Winners receive a BOGO chipotle code!");
                }
                // Start Button
                if (x > 140 && x < 390 && y > 400 && y < 475) {
                    setPlaying(true);
                    game.setScreen(new GameScreen(game));
                }
            }
        });
    }

    public Game getGameFrame() {
        return game;
    }

    public void setGameFrame(Game gameFrame) {
        this.game = gameFrame;
    }

    public JLabel getBackgroundLabel() {
        return background;
    }

    public void setBackgroundLabel(JLabel background) {
        this.background = background;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }
}