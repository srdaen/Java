package objektno1;

public class Zaposleni {
	
	private String ime;
	private String prezime;
	private int godine_staza;
	private double plata;
	
	
	public Zaposleni(String ime, String prezime, int godine_staza, int plata) {
		this.ime = ime;
		this.prezime = prezime;
		this.godine_staza = godine_staza;
		this.plata = plata;
	}
	
	
	public String getIme() {
		return ime;
	}
	
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	
	public String getPrezime() {
		return prezime;
	}
	
	
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	
	public int getGodine_staza() {
		return godine_staza;
	}
	
	
	public void setGodine_staza(int godine_staza) {
		if(godine_staza < 0) {
		System.out.println("Ne moze biti negativno");
		this.godine_staza = 0;
	} else {
		this.godine_staza = godine_staza;
	}
	}
	
	public double getPlata() {
		return plata;
	}
	
	
	public void setPlata(double plata) {
		this.plata = plata;
	}
	
	
	public void ispisiZaposlenog() {
		System.out.println("Ime: " + this.ime + ", prezime: " + this.prezime + ", godine staza: " + this.godine_staza);
	}
	
	
	public void uvecanjePlata() {
		if(this.plata < 800 && this.godine_staza >= 10 ) {
				double staraPlata = this.plata; 
				double novaPlata = staraPlata * 1.06;
				System.out.println("Stara plata je: " + staraPlata + ", Uvecana plata je: " + novaPlata);
		} else {
		System.out.println("Zaposleni ne ispunjava zahtjeve za povecanje plate");
	}
		
		}
	
	public void najvecaPlata() {
		for(int i = 0; i < this.plata ; i++) {
			
		}
	}
	
	public static void main(String[] args) {
		
		Zaposleni z1 = new Zaposleni("Ale", "Aleksic", 10, 123);
		Zaposleni z2 = new Zaposleni("Jova", "Jovic", 1, 700);
		Zaposleni z3 = new Zaposleni("Ser" , "Sergov", 3, 1000);
		
		// z1.uvecanjePlata();
		
	}
	
}
