package game;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
public class Paddle extends Component
{
	final int PADDLE_WIDTH = 10, PADDLE_HEIGHT = 75;
	private int x, y, speed, score;
	private int center;
	private Color color;
	private boolean isAI;
	
	public Paddle(int x, int y, int speed, boolean isAI, Color color)
	{
		this.score= 0;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.color = color;	
		this.isAI = isAI;
		this.center = y + PADDLE_HEIGHT/2;
		
	}
	public void paint(Graphics g) 
	{
		g.setColor(this.color);
		g.fillRect(this.x, this.y, PADDLE_WIDTH, PADDLE_HEIGHT);
	}
	
	public void moveTo(float f)
	{
			this.y += speed * f;
		
			
	}
	public void addScore()
	{
		this.score += 1;
	}
	
	public int getScore()
	{
		return this.score;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public int getX()
	{
		return this.x;
	}
	
}