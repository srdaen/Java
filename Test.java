package objektno1;

public class Test {

	
	public static void main(String[] args) {
		Televizor tv1 = new Televizor(10, "Java", 3);
		Televizor tv2 = new Televizor(10, "RTVP", 0);
		
		Zaposleni g = new Zaposleni("Luka", "Vukovic" , 11, 500);
		
		
		g.ispisiZaposlene();
	}
}
