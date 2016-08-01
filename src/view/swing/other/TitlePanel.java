package view.swing.other;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import view.swing.utils.bo.CustomImageIcon;

public class TitlePanel extends JPanel{
	private static final long serialVersionUID = 1L;

	JSeparator separator;
	
	public TitlePanel(Rectangle bounds){
		setLayout(null);
		setBounds(bounds);
		setBackground(new Color(220, 220, 220));
		
		loadComponents();
	}
	
	public TitlePanel(){
		setLayout(null);
		setBackground(new Color(220, 220, 220));
		
		loadComponents();
	}
	
	public void loadComponents(){
		separator = new JSeparator(SwingConstants.HORIZONTAL);
		separator.setBounds(0,99,getBounds().width,1);
		separator.setBackground(Color.LIGHT_GRAY);
		add(separator);
		
		JLabel jlTitle = new JLabel("Newsletter Panel");
		jlTitle.setBounds(110,0,650,100);
		jlTitle.setFont(new Font("SansSerif", Font.TRUETYPE_FONT, 20));
		jlTitle.setForeground(new Color(115,115,115));
		add(jlTitle);
		
		JLabel jlTitleIcon = new JLabel();
		jlTitleIcon.setBounds(40,0,60,100);
		jlTitleIcon.setBackground(new Color(220, 220, 220));
		jlTitleIcon.setIcon(new CustomImageIcon("/view/images/newsletterIcon.png", "newsletter", 60, 60));
		add(jlTitleIcon);
	}
	
	@Override
	public void setSize(int width, int height) {
		super.setSize(width, height);
		
		separator.setSize(width, separator.getBounds().height);

	}
}
