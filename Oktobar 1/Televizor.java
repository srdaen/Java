package objektno1;

// napisati klasu televizor sa atributima brojKanala, nazivKanala, jacinaTona. 
// potrebno je odraditi konstruktor koji postavlja pocetne vrijednosti atributa
// gettere i settere za sve atribute 
// metod pojacajTon() koji uvecava jacinu tona za 1 ali ne moze preci 10
// metod ispis() koji ispisuje broj kanala, naziv kanala i trenutnu jacinu tona

public class Televizor {
	
	private int brojKanala;
	private String nazivKanala;
	private int jacinaTona;
			
	public Televizor(int brojKanala, String nazivKanala, int jacinaTona ) {
		
	setBrojKanala(brojKanala);
	
	this.nazivKanala = nazivKanala;
	setJacinaTona(jacinaTona);
	
	}

	public int getBrojKanala() {
		return brojKanala;
	}

	public void setBrojKanala(int brojKanala) {
		this.brojKanala = brojKanala;
		
		if(brojKanala >= 1) {
			this.brojKanala=brojKanala;
		} else {
			System.out.println("Broj kanala mora biti veci ili jednak 1");
			this.brojKanala=1;
		}
	}

	public String getNazivKanala() {
		return nazivKanala;
	}

	public void setNazivKanala(String nazivKanala) {
		this.nazivKanala = nazivKanala;
	}

	public int getJacinaTona() {
		return jacinaTona;
	}

	public void setJacinaTona(int jacinaTona) {
		if(jacinaTona>=0 && jacinaTona<=10) {
			this.jacinaTona = jacinaTona;
		} else {
			if(jacinaTona < 0) {
				this.jacinaTona=0;
			} 
			if(jacinaTona > 10) {
				this.jacinaTona = 10;
			}
		}
	
	}



	public void pojacajTon() {
		
		if(this.jacinaTona < 10) {
			this.jacinaTona++;
			System.out.println("Jacina tona je: " + this.jacinaTona);
		} else {
			System.out.println("Ton je vec na max");
		}
	}
	
	public void smanjiTon() {
		if(this.jacinaTona > 0) {
			this.jacinaTona--;
			System.out.println("Ton je smanjen na: " + this.jacinaTona);
		} else {
			System.out.println("Ton je vec na minimumu");
		}
	}

	public void ispisi() {
		System.out.println("Broj kanala: " + this.brojKanala + ", Naziv kanala: " + this.nazivKanala + ", ton: " + this.jacinaTona);

	}
}