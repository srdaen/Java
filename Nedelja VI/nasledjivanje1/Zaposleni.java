package nasledjivanje1;

public class Zaposleni {
	private int ID;
	private String ime;
	private String prezime;
	protected double plataPoSatu;
	protected double ukupanBrojSati;
	protected double plata;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
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
	public double getPlataPoSatu() {
		return plataPoSatu;
	}
	public void setPlataPoSatu(double plataPoSatu) {
		this.plataPoSatu = plataPoSatu;
	}
	public double getUkupanBrojSati() {
		return ukupanBrojSati;
	}
	public void setUkupanBrojSati(double ukupanBrojSati) {
		this.ukupanBrojSati = ukupanBrojSati;
	}
	public double getPlata() {
		return plata;
	}
	public void setPlata(double plata) {
		this.plata = plata;
	}
	public Zaposleni(int iD, String ime, String prezime, double plataPoSatu, double ukupanBrojSati, double plata) {
		super();
		ID = iD;
		this.ime = ime;
		this.prezime = prezime;
		this.plataPoSatu = plataPoSatu;
		this.ukupanBrojSati = ukupanBrojSati;
		this.plata = plata;
	}
	
	public void plata() {}
	
}
