package view.swing.custom.rectlook;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import view.swing.utils.bo.CustomImageIcon;

public class RectlookFormField extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private RectlookTextField textField;
	private JLabel label;
	
	private String description;
	private String iconPath;
	private int height;
	
	public RectlookFormField(String iconPath, String description){
		setBackground(new Color(201, 208, 232));
		this.iconPath = iconPath;
		this.description = description;
		setLayout(null);
		
		loadFormField();
	}
	
	private void loadFormField(){
		removeAll();
		
		height = this.getHeight() - 4;
		
		textField = new RectlookTextField();
		textField.setBounds(2, 2, getWidth() - (height + 2), height);
		textField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 5));
		textField.setFont(new Font("SansSerif", Font.TRUETYPE_FONT, (height / 2)));
		textField.setForeground(new Color(154, 154, 154));
		textField.setPlaceholder(description);
		add(textField);
		
		label = new JLabel();
		label.setBounds(getWidth() - height, 2, height, height);
		label.setBackground(new Color(220, 220, 220));
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label);
		
		setIcon(iconPath);
	}
	
	@Override
	public void setFont(Font font) {
		if(textField != null)
			textField.setFont(font);
	}
	
	public String getText(){
		return textField.getText();
	}
	
	public void setText(String newText){
		textField.setText(newText);
	}
	
	public void setIcon(String iconPath){
		label.setIcon(new CustomImageIcon(iconPath, description, (height / 2), (height / 2)));
	}
	
	@Override
	public void setForeground(Color color){
		if(textField != null)
			textField.setForeground(color);
	}
	
	@Override
	public void setBounds(Rectangle bounds){
		super.setBounds(bounds);
		loadFormField();
	}
	
	@Override
	public void setBounds(int x, int y, int width, int height){
		super.setBounds(x, y, width, height);
		loadFormField();
	}
	
	@Override
	public void setSize(int width, int height) {
		super.setSize(width, height);
		loadFormField();
	}
	
	@Override
	public void setSize(Dimension d) {
		super.setSize(d);
		loadFormField();
	}
	
	
	
}
