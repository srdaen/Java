package array;

import java.util.Scanner;

public class zadatak2 {

	public static void main(String[] args) {
		// provjeri da li je data rijec palindrom
		
		Scanner sc = new Scanner(System.in);
		
		String rijec = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(rijec);
		String obrnuto = sb.reverse().toString();
		
		if(rijec.equalsIgnoreCase(obrnuto)) {
			System.out.println("Jeste palindrom");
		} else {
			System.out.println("Nije palindrom");
		}
		
	}

}
