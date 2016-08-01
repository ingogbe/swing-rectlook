package view.swing.utils.bo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class CustomImageIcon extends ImageIcon{
	private static final long serialVersionUID = 1L;

	/** Returns an ImageIcon, or null if the path was invalid. */
	//createImageIcon
	public CustomImageIcon (String path, String description, int width, int height) {
	    java.net.URL imgURL = getClass().getResource(path);
	    if (imgURL != null) {
	    	Image img = new ImageIcon(imgURL, description).getImage();
	    	Image newimg = img.getScaledInstance(width, height,  java.awt.Image.SCALE_SMOOTH);
	    	setImage(newimg);
	    	setDescription(description);
	    }
	    else{
	    	setImage(null);
	    	setDescription("");
	    }
	}
}
