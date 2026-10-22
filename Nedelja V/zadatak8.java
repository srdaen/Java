package array;

import java.util.Scanner;

public class zadatak8 {

	public static void main(String[] args) {
		
		String s = "1101";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("izaberite poziciju:");
	    int pozicija = sc.nextInt();

	    if (pozicija < 1 || pozicija > s.length()) {
	        System.out.println("neispravna pozicija");
	    	} else {
	        int provjera = pozicija - 1;

	        if (provjera == 0) {
	            if (s.charAt(provjera+ 1) == '1') {
	                System.out.println("1");
	            } else {
	                System.out.println("0");
	           }

	        } else if (provjera == s.length() - 1) {
	            if (s.charAt(provjera - 1) == '1') {
	                System.out.println("1");
	            } else {
	                System.out.println("0");
	            }

	        } else {
	            if (s.charAt(provjera - 1) == '1'
	                    && s.charAt(provjera + 1) == '1') {
	                System.out.println("1");
	            } else {
	                System.out.println("0");
	            }
	        }
	    }
	}
}
