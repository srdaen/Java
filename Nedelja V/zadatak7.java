package array;

import java.util.Scanner;

public class zadatak7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String text = "neka recenica";
		String[] rijeci = text.split(" ");
		
		StringBuilder rez = new StringBuilder();
		
		for(int i = 0; i < rijeci.length; i++ ) {
			String temp = new StringBuilder(rijeci[i]).reverse().toString();
			rez.append(temp).append(" ");
			
		}
		
		System.out.println(rez.toString().trim());
	}

}
