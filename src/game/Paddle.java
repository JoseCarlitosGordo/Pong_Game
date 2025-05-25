package game;
import java.awt.*;
import javax.swing.*;
public class Paddle extends Component
{
	static final int PADDLE_WIDTH = 50, PADDLE_HEIGHT = 50;
	private int x, y, speed;
	private Color color;
	
	public Paddle(int x, int y, int speed,  Color color)
	{
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.color = color;		
	}
	public void paint(Graphics g) 
	{
		g.setColor(this.color);
		g.fillRect(this.x, this.y, PADDLE_WIDTH, PADDLE_HEIGHT);
		
	}
	
	

}
