package game;
import java.awt.*;
import java.util.Random;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
public class PongGame extends JPanel implements KeyListener
{
	private int aiReactionCounter = 0;
	private static final int AI_REACTION_DELAY = 2;
	static final int WINDOW_WIDTH = 640, WINDOW_HEIGHT = 480;
	private Paddle paddle1;
	public Ball ball;
	private Paddle ai;
	private Random random;
	public PongGame()
	{
		paddle1 = new Paddle(140, 160, 10, false, Color.ORANGE);
		ball = new Ball(320, 240, 10, 8,  Color.ORANGE);
		ai = new Paddle(500, 160, 20, true, Color.ORANGE);
		random = new Random();
		addKeyListener(this);
		super.setFocusable(true);
	}
	
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
			
		paddle1.paint(g);
		ball.paint(g);
		ai.paint(g);
		g.drawString(paddle1.getScore() + "", 210, 100);
		g.drawString(ai.getScore() + "", 410, 100);
		
	}
	public void gameLogic()
	{
		
		ball.moveball(WINDOW_WIDTH, WINDOW_HEIGHT, paddle1, ai);
		aiReactionCounter++;
		if(aiReactionCounter >= AI_REACTION_DELAY) 
		{
			aiReactionCounter = 0;
			if (ai.getY() > ball.getY())
			{
				ai.moveTo(-1f);
			}
			else if (ai.getY() < ball.getY())
			{
				ai.moveTo(1f);
			}
		}
		
		if (ball.getX() >= WINDOW_WIDTH)
		{
			paddle1.addScore();
			this.reset();
		}
		else if (ball.getX() <= 0)
		{
			ai.addScore();
			this.reset();
		}
		
		
		
			
		
		
	}
	
	public void reset()
	{
		ball.setX(320);
		ball.setY(240);
		try 
		{
			Thread.sleep(1000);
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_W)
		{
			paddle1.moveTo(-1);
		}
		else if (keyCode == KeyEvent.VK_S)
		{
			paddle1.moveTo(1);
			
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	

}

	

