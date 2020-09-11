package programming.prog9;

import java.util.Scanner;

public class prog9 {

	public static void main(String[] args) {
		
		int money, cost;
		Scanner in = new Scanner(System.in);
		
		System.out.print("¹ÞÀº µ· : ");
		money = in.nextInt();
		System.out.print("»óÇ°ÀÇ ÃÑ¾× : ");
		cost = in.nextInt();
		
		System.out.println("ºÎ°¡¼¼ : " + Math.round(cost * 0.1));
		System.out.println("ÀÜµ· : " + (money - cost));
		
		in.close();

	}

}
