package com.chanaka;

import java.util.ArrayList;

public class Application {
	public static void main(String[] args) {
		
		RoseGarden roseGarden = new RoseGarden();
		//RoseGarde.rose sc = new Rsegarden.rose
 
		/*ArrayList<Rose> roses  = new RoseGarden("Frienship Rose", "White", 3).roses;
		
		for(Rose rose:roses) {
			System.out.println(rose.toString());

		}*/
		
		roseGarden.addRose("Red", "Beautifull");
		roseGarden.addRose("Red Blue", "Beautifull More");
		roseGarden.addRose("Red Green", "More Beautifull");
		roseGarden.getRoses();
	}

}
