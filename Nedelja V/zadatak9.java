package array;

import java.util.Scanner;

public class zadatak9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("unesi neki broj");
		String s = sc.nextLine();
		String rezultat = new String();
		
		for(int i = 0; i < s.length(); i++) {
			int c = s.charAt(i);
			if(c % 2 == 0) {
				rezultat += '0';
				
			} else {
				rezultat += '1' ;
			}
		}

		System.out.println(rezultat);
		
	}

}
