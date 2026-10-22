package nasledjivanje1;

public class Konobar extends Zaposleni {
	
	private double prekovremeno;

	public Konobar(int iD, String ime, String prezime, double plataPoSatu, double ukupanBrojSati, double plata,
			double prekovremeno) {
		super(iD, ime, prezime, plataPoSatu, ukupanBrojSati, plata);
		this.prekovremeno = prekovremeno;
	}

	public double getPrekovremeno() {
		return prekovremeno;
	}

	public void setPrekovremeno(double prekovremeno) {
		this.prekovremeno = prekovremeno;
	}
	
	public void plata() {
		this.setPlata(4*getPlataPoSatu() * getUkupanBrojSati() + getPlataPoSatu() * getPrekovremeno() * 1.2); 
		System.out.println(plata);
	}

	@Override
	public String toString() {
		return "Konobar [prekovremeno = " + prekovremeno + ", plataPoSatu = " + plataPoSatu + ", ukupanBrojSati = "
				+ ukupanBrojSati + ", plata = " + plata + "]";
	}
	
	
}
