package view.swing.other;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class BottomPanel extends JPanel{
	private static final long serialVersionUID = 1L;

	JSeparator separator;
	
	public BottomPanel(Rectangle bounds){
		setLayout(null);
		setBounds(bounds);
		setBackground(new Color(220, 220, 220));
		
		loadComponents();
	}
	
	public BottomPanel(){
		setLayout(null);
		setBackground(new Color(220, 220, 220));
		
		loadComponents();
	}
	
	public void loadComponents(){
		separator = new JSeparator(SwingConstants.HORIZONTAL);
		separator.setBounds(0,0,getBounds().width,1);
		separator.setBackground(Color.LIGHT_GRAY);
		add(separator);
		
		JLabel jlBottom = new JLabel("<html>Hey Buddy! Already subscribe<br>No Problem Click Here<html>");
		jlBottom.setBounds(40,0,650,100);
		jlBottom.setFont(new Font("SansSerif", Font.TRUETYPE_FONT, 14));
		jlBottom.setForeground(new Color(115,115,115));
		add(jlBottom);
	}
	
	@Override
	public void setSize(int width, int height) {
		super.setSize(width, getParent().getHeight() - getBounds().y);
		
		separator.setSize(width, separator.getHeight());

	}
}
