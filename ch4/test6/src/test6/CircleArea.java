package test6;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius;
		double area;
		Scanner input = new Scanner(System.in);
		System.out.print("�������� �Է��Ͻÿ� : ");
		radius = input.nextDouble();
		area = 3.14 * radius * radius;
		
		System.out.println(area);
		
	}

}
