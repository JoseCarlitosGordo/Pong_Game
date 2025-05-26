package game;


import java.awt.event.*;

import javax.swing.*;

public class Main 
{
	static JFrame frame = new JFrame("Pong");

	public static void main(String[] args) 
	{
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(650, 495);
		PongGame GameState = new PongGame();
		//adds the game into the frame, allowing elements to exist in the application
		frame.add(GameState);
		frame.setVisible(true);
		
		//action listener for our game loop. This captures player input
		ActionListener gameLoop = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				GameState.gameLogic();
				GameState.repaint();
			}
			
		};
		Timer gameTimer = new Timer(33, gameLoop);
		gameTimer.start();

	}

}
