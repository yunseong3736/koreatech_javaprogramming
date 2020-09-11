package test7;

import java.util.Scanner;

public class MidTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double rate = 1392.83;
		double dollar;
		int won;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Won : ");
		won = in.nextInt();
		
		dollar = won / rate;
		System.out.println("Dollar : " + dollar);
		System.out.printf("Dollar : %.2f\n", dollar);
		
		in.close();
	}

}
