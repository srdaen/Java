package array;

import java.util.Scanner;

public class zadatak4 {

	public static void main(String[] args) {
		// pronadji 2 slova koja se u stringu uzastopno ponavljaju
		
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		for(int i = 0; i < s.length()-1 ; i++ ) {
			char c = s.charAt(i);
			char b = s.charAt(i+1);
			if(c == b) {
				System.out.println("Slovo koje se ponavlja je " + c);
			}
		}
		
		
	}

}
