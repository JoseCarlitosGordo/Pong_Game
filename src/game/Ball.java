package game;

import java.awt.*;
import javax.swing.*;
public class Ball extends Component
{
	final int PADDLE_WIDTH = 10, PADDLE_HEIGHT = 10;
	private int x, y, xVelocity, yVelocity, speed;
	private Color color;
	public Ball(int x, int y, int xVelocity, int yVelocity, int speed, Color color)
	{
		this.x = x;
		this.y = y;
		this.xVelocity = xVelocity;
		this.yVelocity = yVelocity;
		this.speed = speed;
		this.color = color;
		
	}
	
	public void paint(Graphics g)
	{
		g.setColor(this.color);
		g.fillRect(this.x, this.y, PADDLE_WIDTH, PADDLE_HEIGHT);
		
	}

}
