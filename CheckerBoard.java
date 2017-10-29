/* a checkerboard consists of an 8 by 8 grid of black and red squares in which no two
squares of the same color are adjacent. Write a graphics program that displays a checkerboard*/

import javax.swing.*;
import java.awt.*;


public class CheckerBoard
{

	public static void main(String[] args)
	{
				
		JFrame theGUI = new JFrame();
		theGUI.setSize(500, 500);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container pane = theGUI.getContentPane();
		
		GridLayout theGrid = new GridLayout(8, 8);
		
		pane.setLayout(theGrid);
		
		
		for(int i = 0; i < 8; i++)
			{
				for(int j = 0; j < 8; j++)
					{
						if(i % 2 == 0)
							{
								if(j % 2 == 0)
								{
									pane.add(new CheckerPanel(Color.blue));
								}
								else
									pane.add(new CheckerPanel(Color.yellow));
							}
						else
						{
							if(j % 2 == 0)
								{
									pane.add(new CheckerPanel(Color.yellow));
								}
								else
									pane.add(new CheckerPanel(Color.blue));
						}
						
					}
			}


		
		theGUI.setVisible(true);
	}
}