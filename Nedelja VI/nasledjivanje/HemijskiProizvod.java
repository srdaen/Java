package nasledjivanje;

public class HemijskiProizvod extends Proizvod{
	private float temperaturaSkladistenja;
	private boolean zapaljivo;
	
	public HemijskiProizvod(String opisProizvoda, String barKod, String zemljaProizvodnje, int godinaProizvodnje,
			double uvoznaCijena) {
		super(opisProizvoda, barKod, zemljaProizvodnje, godinaProizvodnje, uvoznaCijena);

	}

	public float getTemperaturaSkladistenja() {
		return temperaturaSkladistenja;
	}

	public void setTemperaturaSkladistenja(float temperaturaSkladistenja) {
		this.temperaturaSkladistenja = temperaturaSkladistenja;
	}

	public boolean isZapaljivo() {
		return zapaljivo;
	}

	public void setZapaljivo(boolean zapaljivo) {
		this.zapaljivo = zapaljivo;
	}
	
	public void izracunajCijenu() {
		
		if(this.zapaljivo) {
			this.setUvoznaCijena(getUvoznaCijena() * 1.25);
		} else {
			this.setUvoznaCijena(getUvoznaCijena() *  1.1);
		}
	}

	@Override
	public String toString() {
		return "HemijskiProizvod [temperaturaSkladistenja=" + temperaturaSkladistenja + ", zapaljivo=" + zapaljivo
				+ "]";
	}
	

	
}
