package game;
import java.awt.*;
import javax.swing.*;
public class PongGame extends JPanel
{
	private Paddle paddle1;
	public PongGame()
	{
		paddle1 = new Paddle(215, 160, 0, Color.ORANGE);
		
	}
	static final int WINDOW_WIDTH = 640, WINDOW_HEIGHT = 480;
	
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
		
		paddle1.paint(g);
		
		
	}

}
