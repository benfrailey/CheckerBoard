import javax.swing.*;
import java.awt.*;

public class CheckerPanel extends JPanel
{

	Color panelColor;
	String message; // instance variable

	public CheckerPanel(Color c)
	{
		panelColor = c;
		this.setBackground(c);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int panelWidth = this.getWidth();
		int panelHeight = this.getHeight();
		
		
		g.setColor(Color.blue);
	}
}