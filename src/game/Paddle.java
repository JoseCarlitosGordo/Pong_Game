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
	private int x, y, speed;
	private int center;
	private Color color;
	private boolean isAI;
	
	public Paddle(int x, int y, int speed, boolean isAI, Color color)
	{
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
	
	public void moveTo(int direction)
	{
		this.y += speed * direction;
			
	}
	
}