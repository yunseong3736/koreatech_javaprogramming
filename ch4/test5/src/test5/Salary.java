package test5;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
		int salary;
		double deposit;
		Scanner input = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ� : ");
		salary = input.nextInt();
		
		deposit = 10 * 12 * salary;
		System.out.println("10�� ������ ����� : " + deposit);
		
		input.close();
		
	}

}
