package test5;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
		int salary;
		double deposit;
		Scanner input = new Scanner(System.in);
		
		System.out.println("월급을 입력하시오 : ");
		salary = input.nextInt();
		
		deposit = 10 * 12 * salary;
		System.out.println("10년 동안의 저축액 : " + deposit);
		
		input.close();
		
	}

}
