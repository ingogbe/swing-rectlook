package general;

import view.swing.screens.CPGeneral;
import view.swing.utils.AlterFonts;

public class Main {
	
	public static void main(String[] x){
		AlterFonts.alterFonts();
		
		CPGeneral cpGeneral = new CPGeneral();
		cpGeneral.setVisible(true);
	}

}
