package nasledjivanje;

import java.time.LocalDate;

public class Hrana extends Proizvod {
	
	private double brojKalorija;
	private LocalDate rokTrajanja;
	
	public Hrana(String opisProizvoda, String barKod, String zemljaProizvodnje, int godinaProizvodnje,
			double uvoznaCijena, double brojKalorija, LocalDate rokTrajanja) {
		super(opisProizvoda, barKod, zemljaProizvodnje, godinaProizvodnje, uvoznaCijena);
		this.setBrojKalorija(brojKalorija);
		this.rokTrajanja = rokTrajanja;
	}
	
	public double getBrojKalorija() {
		return brojKalorija;
	}
	public void setBrojKalorija(double brojKalorija) {
		if(brojKalorija > 0)
		this.brojKalorija = brojKalorija;
	}
	public LocalDate getRokTrajanja() {
		return rokTrajanja;
	}
	public void setRokTrajanja(LocalDate rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
	}
	
	public void izracunatiCijenu( ) {
		
		LocalDate danas = LocalDate.now();
		
		if(danas.minusMonths(6).isAfter(rokTrajanja)) {
			this.setUvoznaCijena(getUvoznaCijena() * 1.1);
		} else {
			this.setUvoznaCijena(getUvoznaCijena() * 1.05);
		}
	}
	
	public void izracunajCijenu() {
		if(rokTrajanja.isBefore(LocalDate.now().plusMonths(6))) {
			this.setUvoznaCijena(getUvoznaCijena() * 1.1); 
		} else {
			this.setUvoznaCijena(getUvoznaCijena() * 1.05); 
		}
	}

	@Override
	public String toString() {
		return "Hrana [brojKalorija=" + brojKalorija + ", rokTrajanja=" + rokTrajanja + ", uvoznaCijena=" + uvoznaCijena
				+ "]";
	}
	
	
	
}
