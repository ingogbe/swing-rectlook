package view.swing.custom.rectlook;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;

public class RectlookCheckBoxIcon implements Icon {
	Color primaryColor, secundaryColor;
	int border, width, height, type;
	
	public static final int NORMAL = 1;
	public static final int SELECTED = 2;
	public static final int ROLLOVER = 3;
	public static final int PRESSED = 4;
	public static final int DISABLED = 5;
	public static final int DISABLED_SELECTED = 6;
	public static final int ROLLOVER_SELECTED = 7;
	
	public RectlookCheckBoxIcon(Color primary, Color secundary, int type) {
		this.primaryColor = primary;
		this.secundaryColor = secundary;
		this.border = 1;
		this.width = 15;
		this.height = 15;
		this.type = type;
	}
	
	public RectlookCheckBoxIcon(Color primary, Color secundary, int type, int border) {
		this.primaryColor = primary;
		this.secundaryColor = secundary;
		this.border = border;
		this.width = 15;
		this.height = 15;
		this.type = type;
	}
	
	public RectlookCheckBoxIcon(Color primary, Color secundary, int type, int border, int width, int height) {
		this.primaryColor = primary;
		this.secundaryColor = secundary;
		this.border = border;
		this.width = width;
		this.height = height;
		this.type = type;
	}
	
	public RectlookCheckBoxIcon(Color primary, Color secundary, int type, int width, int height) {
		this.primaryColor = primary;
		this.secundaryColor = secundary;
		this.border = 1;
		this.width = width;
		this.height = height;
		this.type = type;
	}
	
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Color oldColor = g.getColor();
		int selec = 3;
		
		switch (type) {
		case SELECTED:
			g.setColor(secundaryColor);
			g.fillRect(x, y, width, height);
			g.setColor(Color.WHITE);
			g.fillRect(x + border, y + border, width - (border * 2), height - (border * 2));
			g.setColor(primaryColor);
			g.fillRect(x + border + selec, y + border + selec, width - (border * 2) - (selec * 2), height - (border * 2) - (selec * 2));
			break;
		case ROLLOVER_SELECTED:
			g.setColor(secundaryColor);
			g.fillRect(x, y, width, height);
			g.setColor(Color.WHITE);
			g.fillRect(x + border, y + border, width - (border * 2), height - (border * 2));
			g.setColor(primaryColor);
			g.fillRect(x + border + selec, y + border + selec, width - (border * 2) - (selec * 2), height - (border * 2) - (selec * 2));
			break;
		case ROLLOVER:
			g.setColor(secundaryColor);
			g.fillRect(x, y, width, height);
			g.setColor(Color.WHITE);
			g.fillRect(x + border, y + border, width - (border * 2), height - (border * 2));
			break;
		case PRESSED:
			g.setColor(secundaryColor);
			g.fillRect(x, y, width, height);
			g.setColor(primaryColor);
			g.fillRect(x + border, y + border, width - (border * 2), height - (border * 2));
			break;
		case NORMAL:
			g.setColor(secundaryColor);
			g.fillRect(x, y, width, height);
			g.setColor(Color.WHITE);
			g.fillRect(x + border, y + border, width - (border * 2), height - (border * 2));
			break;
		case DISABLED_SELECTED:
			g.setColor(new Color(141,141,141));
			g.fillRect(x, y, width, height);
			g.setColor(new Color(190,190,190));
			g.fillRect(x + border, y + border, width - (border * 2), height - (border * 2));
			g.setColor(new Color(141,141,141));
			g.fillRect(x + border + selec, y + border + selec, width - (border * 2) - (selec * 2), height - (border * 2) - (selec * 2));
			break;
		case DISABLED:
			g.setColor(new Color(141,141,141));
			g.fillRect(x, y, width, height);
			g.setColor(new Color(190,190,190));
			g.fillRect(x + border, y + border, width - (border * 2), height - (border * 2));
			break;
		default:
			g.setColor(secundaryColor);
			g.fillRect(x, y, width, height);
			g.setColor(Color.WHITE);
			g.fillRect(x + border, y + border, width - (border * 2), height - (border * 2));
			break;
		}
		
	    g.setColor(oldColor);
	}
	
	public int getIconWidth() {
		return width;
	}
	
	public int getIconHeight() {
		return height;
	}
}
