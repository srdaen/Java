package array;

public class zadatak5 {

	public static void main(String[] args) {
		// provjeri da li je drugi string podstring prvog
		
		String s = "Nemoj jovice";
		String s1 = "jovane";
		
		s = s.toLowerCase();
		s1 = s1.toLowerCase();
		
		if(s.contains(s1)) {
			System.out.println("Prvi string sadrzi drugi");
		} else {
			System.out.println("Ne sadrzi");
		}

	}

}
