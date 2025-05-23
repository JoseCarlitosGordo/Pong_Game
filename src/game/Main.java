package game;

import javax.swing.*;

public class Main 
{
	static JFrame frame = new JFrame("Pong");

	public static void main(String[] args) 
	{
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(690, 480);
		frame.setVisible(true);
		
		PongGame GameState = new PongGame();
		frame.add(GameState);

	}

}
