package nasledjivanje1;

public class Kuvar extends Zaposleni {

	public Kuvar(int iD, String ime, String prezime, double plataPoSatu, double ukupanBrojSati, double plata) {
		super(iD, ime, prezime, plataPoSatu, ukupanBrojSati, plata);
	}

	public void plata() {
		this.setPlata(4 * (getPlataPoSatu() * getUkupanBrojSati()) + 1500);
		System.out.println(plata);
	}

	@Override
	public String toString() {
		return "Kuvar [plataPoSatu = " + plataPoSatu + ", ukupanBrojSati = " + ukupanBrojSati + ", plata = " + plata + "]";
	}

}
