package nasledjivanje1;

public class Menadzer extends Zaposleni {

	private int bonus;

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public Menadzer(int iD, String ime, String prezime, double plataPoSatu, double ukupanBrojSati, double plata,
			int bonus) {
		super(iD, ime, prezime, plataPoSatu, ukupanBrojSati, plata);
		this.bonus = bonus;
	}

	public void plata() {
		this.setPlata(4 * (getUkupanBrojSati() * getPlataPoSatu()) + getBonus() + 1300);
		System.out.println(plata);
	}

	@Override
	public String toString() {
		return "Menadzer [bonus = " + bonus + ", plataPoSatu = " + plataPoSatu + ", ukupanBrojSati = " + ukupanBrojSati
				+ ", plata = " + plata + "]";
	}
 	
}
