package array;

import java.util.Scanner;

public class zadatak3 {

	public static void main(String[] args) {
		// broji samoglasnike i suglasnike
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi recenicu");
		String recenica = sc.nextLine().trim();
		
		String samoglasnici = "aeiouAEIOU";
		
		int samoglasnik = 0;
		int suglasnik = 0;
		
		for(int i = 0; i < recenica.length(); i++ ) {
			char c = recenica.charAt(i);
			if(Character.isLetter(c)) {
				if(samoglasnici.indexOf(c) != -1) {
					samoglasnik++;
				} else {
					suglasnik++;
				}
			}
		}
		
		System.out.println("Broj samoglasnika je " + samoglasnik + ", broj suglasnika je " + suglasnik);
		
	}

}
