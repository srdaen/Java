package array;

import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {
		// napisi kod koji broji broj rijeci u recenici
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite recenicu");
		String recenica = sc.nextLine().trim();
		
		String[] rijeci = recenica.split("\\S+");
				
		System.out.println("Recenica ima " + rijeci.length + " rijeci");
				
	}

}
