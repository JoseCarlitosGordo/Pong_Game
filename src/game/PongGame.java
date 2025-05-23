package game;
import java.awt.*;
import javax.swing.*;
public class PongGame extends JPanel
{
	static final int WINDOW_WIDTH = 680, WINDOW_HEIGHT = 465;
	
	public void createGraphics(Graphics graphic)
	{
		graphic.setColor(Color.BLUE);
		graphic.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
		
		
	}

}
