package com.KPMS.main;

import java.util.ArrayList;

import com.KPMS.UI.Window;
import com.KPMS.entites.Prisoner;

public class KPMSMain {
	
	//TO ALLOW FOR JSON INTERACTION INSTALL THE json-simple libarary

	public static void main(String[] args) {
		Window window = new Window();
		ArrayList<String> meds = new ArrayList();
		meds.add("Weed");
		meds.add("speed");
		meds.add("ket");
		meds.add("blue");
		//new Prisoner(1, "Arron Wells", 6, 29, 8, 2019,  meds, "Unemployed", "Max" );

		new Prisoner(1);

	}

}
