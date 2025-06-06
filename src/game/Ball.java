package game;

import java.awt.*;
import java.util.Random;
import javax.swing.*;
public class Ball extends Component
{
	final int BALL_WIDTH = 10, BALL_HEIGHT = 10;
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
		g.fillRect(this.x, this.y, BALL_WIDTH, BALL_HEIGHT);
		
	}
	
	public boolean position_overlaps_with_paddle(Paddle paddle)
	{
		boolean output = false;
		if (this.x >= paddle.getX() && this.x <= paddle.getX() + paddle.PADDLE_WIDTH && this.y >= paddle.getY() && this.y <= paddle.getY() + paddle.PADDLE_HEIGHT)
		{
			
			output = true;
		}
		return output;
		
	}
	public void moveball(int width, int height, Paddle player1, Paddle player2 )
	{
		this.x += this.xVelocity;
		this.y += this.yVelocity;
		if (this.position_overlaps_with_paddle(player1) || this.position_overlaps_with_paddle(player2))
		{
			
			this.xVelocity = -this.xVelocity; 
			
		}
		if (this.y + BALL_HEIGHT > height || this.y < 0) 
		{
			this.yVelocity = -this.yVelocity;
	    }
		
	}
	
	

	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
}
