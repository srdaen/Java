package nasledjivanje;

import java.time.LocalDate;
import java.util.ArrayList;

public class proizvodTest {

	public static void main(String[] args) {
		
		Garderoba g1 = new Garderoba("majica","234223","Crna Gora",2026,2.5);
	//	HemijskiProizvod h1 = new HemijskiProizvod("prasak", "23525251", "Amerika", 2026, 2.5);
		Hrana h2 = new Hrana("pica", "22467765", "Italija", 2026,11,600, LocalDate.now());
	
		ArrayList<Proizvod> lista = new ArrayList<>();
		lista.add(g1);
	//	lista.add(h1);
		lista.add(h2);
		
		for(Proizvod p:lista) {
			System.out.println(p);
		}
		
		System.out.println("************");
		
		for(Proizvod p:lista) {
			p.izracunajCijenu();
		}
	}

}
