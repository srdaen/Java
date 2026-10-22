package nasledjivanje1;

import java.util.ArrayList;

public class Restoran {
	
	private String naziv;
	private String adresa;
	private int pib;
	private ArrayList<Zaposleni> zaposleni;
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public int getPib() {
		return pib;
	}
	public void setPib(int pib) {
		this.pib = pib;
	}
	public ArrayList<Zaposleni> getZaposleni() {
		return zaposleni;
	}
	public void setZaposleni(ArrayList<Zaposleni> zaposleni) {
		this.zaposleni = zaposleni;
	}
	public Restoran(String naziv, String adresa, int pib, ArrayList<Zaposleni> zaposleni) {
		super();
		this.naziv = naziv;
		this.adresa = adresa;
		this.pib = pib;
		this.zaposleni = zaposleni;
	}
	
	public void dodajZaposlenog(Zaposleni z) {
		zaposleni.add(z);
	}
	
	public void ukloniZaposlenog(Zaposleni z) {
		zaposleni.remove(z.getID());
	}
	
	public void nadjiZaposlenog(int id) {
		for(Zaposleni z:this.zaposleni) {
			if(z.getID() == id) {
				System.out.println(z.getIme());
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Zaposleni> zaposleni = new ArrayList<>();
		Konobar konobar1 = new Konobar(12, "Hari", "Konobari", 4, 40, 10, 5 );
		Kuvar kuvar1 = new Kuvar(11, "Dzaba", "Savic", 3, 40, 20);
		Menadzer m1 = new Menadzer(333, "Meni", "Men", 5, 40, 10, 100);
				
		Restoran r1 = new Restoran("Astorija", "City Kvart", 123, zaposleni);
	
		r1.dodajZaposlenog(kuvar1);
		r1.dodajZaposlenog(konobar1);
		r1.dodajZaposlenog(m1);
		
		for(Zaposleni z:zaposleni) {
			System.out.println(z);
		}
		
		System.out.println("******************");
		
		for(Zaposleni z:zaposleni) {
			z.plata();
		}
	
	}
	

}
	
