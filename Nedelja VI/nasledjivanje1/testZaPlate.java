package nasledjivanje1;

import java.util.ArrayList;

public class testZaPlate {
	
	Konobar k1 = new Konobar(23 , "Harun", "Avdovic", 2, 40, 1, 5 );
	Kuvar kuvar = new Kuvar(2222, "Joco", "Jovic", 4, 20, 1);
	Menadzer m1 = new Menadzer(311, "Mekso", "Mekic", 2, 15, 1, 100);
	
	ArrayList<Zaposleni> list = new ArrayList<>();
	{
	list.add(k1);
	list.add(kuvar);
	list.add(m1);
	
	for(Zaposleni z :list) {
		System.out.println(z);
	}
	
}
}