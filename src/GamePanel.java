import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{

    //Screen settings
    final int originalTilesize = 16; //16 x 16 tile
    final int scale = 3;
    final int tileSize = originalTilesize * scale; // 48x48 tile
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol; // 768 pixel
    final int screenHight = tileSize * maxScreenRow;  // 576 pixel

    Thread gameThread;


    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);  //enabling this can improve game's rendering performance
    }

    public void startGameThread(){


        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        while(gameThread != null){
            //System.out.println("The game loop is running");

            //1. UPDATE: update information such as character positions
            update();
            //2. DRAW: draw the screen with the updated information
            repaint();
        }
    }

    public void update(){

    }
    public void paintComponent(Graphics g){  //A class that has many functions to draw objects on the screen.
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;

        g2.setColor(Color.white);

        g2.fillRect(100, 100, tileSize, tileSize);
        g2.dispose();
    }
}
