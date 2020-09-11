package programming.prog1;

import java.util.Scanner;

public class prog1 {

	public static void main(String[] args) {
		final double FACTOR = 1.609; // 상수는 대문자로 (통상)
		Scanner in = new Scanner(System.in);
		double mile, km;
		
		System.out.print("Enter mile : ");
		mile = in.nextDouble();
		
		km = FACTOR * mile;
		System.out.println(mile + " mile is " + km + " km");
		System.out.printf("%.2f mile is %.2f km\n", mile, km);
		
		in.close();
		
	}

}
