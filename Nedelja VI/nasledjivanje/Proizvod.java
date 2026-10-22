package nasledjivanje;

public class Proizvod {
	private String opisProizvoda;
	private String barKod;
	private String zemljaProizvodnje;
	private int godinaProizvodnje;
	protected double uvoznaCijena;
	
	public Proizvod(String opisProizvoda, String barKod, String zemljaProizvodnje, int godinaProizvodnje,
			double uvoznaCijena) {
		super();
		this.opisProizvoda = opisProizvoda;
		this.barKod = barKod;
		this.zemljaProizvodnje = zemljaProizvodnje;
		this.godinaProizvodnje = godinaProizvodnje;
		this.uvoznaCijena = uvoznaCijena;
	}


	public String getOpisProizvoda() {
		return opisProizvoda;
	}

	public void setOpisProizvoda(String opisProizvoda) {
		this.opisProizvoda = opisProizvoda;
	}

	public String getBarKod() {
		return barKod;
	}

	public void setBarKod(String barKod) {
		this.barKod = barKod;
	}

	public String getZemljaProizvodnje() {
		return zemljaProizvodnje;
	}

	public void setZemljaProizvodnje(String zemljaProizvodnje) {
		this.zemljaProizvodnje = zemljaProizvodnje;
	}

	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}

	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}

	public double getUvoznaCijena() {
		return uvoznaCijena;
	}

	public void setUvoznaCijena(double uvoznaCijena) {
		this.uvoznaCijena = uvoznaCijena;
	}
	
	public void izracunajCijenu() {}

	public static void main(String[] agrs) {
		
	}
}
