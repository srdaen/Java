package nasledjivanje;

public class Garderoba extends Proizvod{
	
	
	private String materijalProizvodnje;
	private String sezona;
	
	public Garderoba(String opisProizvoda, String barKod, String zemljaProizvodnje, int godinaProizvodnje,
			double uvoznaCijena) {
		super(opisProizvoda, barKod, zemljaProizvodnje, godinaProizvodnje, uvoznaCijena);
		
	}
	
	public String getMaterijalProizvodnje() {
		return materijalProizvodnje;
	}
	public void setMaterijalProizvodnje(String materijalProizvodnje) {
		this.materijalProizvodnje = materijalProizvodnje;
	}
	public String getSezona() {
		return sezona;
	}
	public void setSezona(String sezona) {
		this.sezona = sezona;
	}
	
	public void izracunajCijenu () {
		this.setUvoznaCijena(getUvoznaCijena() * 1.05);
		// this.uvoznaCijena = this.getUvoznaCijena() * 1.05;
	}

	@Override
	public String toString() {
		return "Garderoba [materijalProizvodnje=" + materijalProizvodnje + ", sezona=" + sezona + ", uvoznaCijena="
				+ uvoznaCijena + "]";
	}
	
	
	

}
