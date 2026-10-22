package array;

public class zadatak6 {

	public static void main(String[] args) {
		// kreirati stringbuilder sa sadrzajem programiranje. obrisati slova od 3. do 6. indeksa
		
		StringBuilder sb = new StringBuilder("programiranje");
		
		sb.delete(3, 6);
		System.out.println(sb);


	}

}
