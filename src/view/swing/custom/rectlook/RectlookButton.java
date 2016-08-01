package view.swing.custom.rectlook;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class RectlookButton extends JButton{
	
	private static final long serialVersionUID = 1L;
	
	public static final int DEFAULT_TYPE = 1;
	public static final int PRIMARY_TYPE = 2;
	public static final int SUCCESS_TYPE = 3;
	public static final int INFO_TYPE = 4;
	public static final int WARNING_TYPE = 5;
	public static final int DANGER_TYPE = 6;

	private Color color_bg;
	private Color color_bg_hover;
	private Color color_bg_pressed;
	private Color color_border;
	private Color color_font;
	
	private String text;
	private Font font;

	public RectlookButton(String text, int type){
		setType(type);
		setSize(40, 30);
		this.font = new Font("SansSerif", Font.TRUETYPE_FONT, this.getHeight() / 3);
		setFont(font);
		this.text = text;
		
		setBorder(BorderFactory.createLineBorder(color_border));
		
	}
	
	@Override
	public void setBackground(Color bg) {
		color_bg = bg;
	}
	
	public void setPressedBackground(Color bg){
		color_bg_pressed = bg;
	}
	
	public void setHoverBackground(Color bg){
		color_bg_hover = bg;
	}
	
	@Override
	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public void setBounds(Rectangle r) {
		super.setBounds(r);
		if(font != null)
			setFont(new Font(font.getFontName(), font.getStyle(), this.getHeight() / 3));
	}
	
	@Override
	public void setBounds(int x, int y, int width, int height) {
		super.setBounds(x, y, width, height);
		if(font != null)
			setFont(new Font(font.getFontName(), font.getStyle(), this.getHeight() / 3));
	}
	
	public void setType(int type){
		switch (type) {
			case DEFAULT_TYPE:
				color_font = Color.BLACK;
				color_bg = new Color(255,255,255);
				color_bg_hover = new Color(230,230,230);
				color_bg_pressed = new Color(219,219,219);
				color_border = new Color(219,219,219);
				break;
			case PRIMARY_TYPE:
				color_font = Color.WHITE;
				color_bg = new Color(51,122,183);
				color_bg_hover =  new Color(40,96,144);
				color_bg_pressed = new Color(109, 143, 172);
				color_border = new Color(109, 143, 172);
				break;
			case SUCCESS_TYPE:
				color_font = Color.WHITE;
				color_bg = new Color(92,184,92);
				color_bg_hover =  new Color(68,157,68);
				color_bg_pressed = new Color(64,149,64);
				color_border = new Color(64,149,64);
				break;
			case INFO_TYPE:
				color_font = Color.WHITE;
				color_bg =  new Color(91,192,222);
				color_bg_hover =  new Color(49,176,213);
				color_bg_pressed = new Color(114,195,219);
				color_border = new Color(114,195,219);
				break;
			case WARNING_TYPE:
				color_font = Color.WHITE;
				color_bg =  new Color(240,173,78);
				color_bg_hover = new Color(236,151,31);
				color_bg_pressed = new Color(235,180,101);
				color_border = new Color(235,180,101);
				break;
			case DANGER_TYPE:
				color_font = Color.WHITE;
				color_bg =  new Color(217,83,79);
				color_bg_hover = new Color(201,48,44);
				color_bg_pressed = new Color(191,46,42);
				color_border = new Color(191,46,42);
				break;
			default:
				color_font = Color.BLACK;
				color_bg = new Color(255,255,255);
				color_bg_hover = new Color(230,230,230);
				color_bg_pressed = new Color(219,219,219);
				color_border = new Color(219,219,219);
				break;
		}
	}
	
	@Override
	protected void paintComponent(Graphics pG) {
		super.paintComponent(pG);
		
		final Graphics2D g = (Graphics2D) pG;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		
        if (getModel().isPressed())
            g.setColor(color_bg_pressed);
        else if (getModel().isRollover())
            g.setColor(color_bg_hover);
        else
            g.setColor(color_bg);
       
        g.fillRect(0, 0, getWidth(), getHeight());
       
        g.setColor(color_font);
        int auxY = ((getBounds().height - g.getFontMetrics().getHeight()) / 2);
        int auxX = ((getBounds().width - g.getFontMetrics().stringWidth(text)) / 2);
        g.drawString(text, auxX, g.getFontMetrics().getMaxAscent() + auxY);
        
        
    }

}
