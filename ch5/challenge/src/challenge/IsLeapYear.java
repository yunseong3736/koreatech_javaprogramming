package challenge;

import java.util.Scanner;

public class IsLeapYear {

	public static void main(String[] args) {
		int year;
		boolean isLeapYear;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year : ");
		year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			isLeapYear = true;
		else
			isLeapYear = false;
		System.out.println(isLeapYear);
	}

}
