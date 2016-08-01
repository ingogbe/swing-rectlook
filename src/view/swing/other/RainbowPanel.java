package view.swing.other;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class RainbowPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;

	private Color colors[] = {Color.GREEN, Color.ORANGE, Color.YELLOW, Color.RED, Color.MAGENTA, Color.PINK, Color.BLUE, Color.CYAN};
	
	public RainbowPanel(Rectangle bounds){
		setLayout(null);
		setBounds(bounds);
		
	}
	
	public RainbowPanel(){
		setLayout(null);
		
	}
	
    @Override
    protected void paintComponent(final Graphics pG) {
        super.paintComponent(pG);

        final Graphics2D g = (Graphics2D) pG;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        
        int posX = 0;
		int counter = 0;
		for(int i = 0; i <= getBounds().width / 100; i++){
			g.setColor(colors[counter]);
			g.fillRect(posX, 0, 100, 15);
			posX += 100;
			counter++;
			if(counter == 8)
				counter = 0;
		}
    }
}
