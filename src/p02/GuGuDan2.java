package p02;

import java.util.Scanner;

public class GuGuDan2 {

	public static void main(String[] args) {
	 
		/*
		 * input:4
		 * 1x4=4
		 * 2X4=8
		 * ...
		 * 9X4=36
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("입력하시오:");
		String Numstr = scan.nextLine();
		for(int i=1; i<=9; i++) {
			System.out.println(i + "X" + Numstr + " = " + Integer.parseInt(Numstr)*i);
		}
	}

}
