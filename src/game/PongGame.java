package game;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
public class PongGame extends JPanel implements KeyListener
{
	
	static final int WINDOW_WIDTH = 640, WINDOW_HEIGHT = 480;
	private Paddle paddle1;
	private Ball ball;
	private Paddle ai;
	public PongGame()
	{
		paddle1 = new Paddle(140, 160, 10, false, Color.ORANGE);
		ball = new Ball(320, 240, 0, 0, 0, Color.ORANGE);
		ai = new Paddle(500, 160, 0, true, Color.ORANGE);
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
		
	}
	public void gameLogic()
	{
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		System.out.println(e.getKeyCode());
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_W)
		{
			paddle1.moveTo(-1);
		}
		else if (keyCode == KeyEvent.VK_S)
		{
			
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	

}

	

