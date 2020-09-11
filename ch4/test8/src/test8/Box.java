package test8;

import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double width, height;
		double area, perimeter;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter width and height : ");
		width = in.nextDouble();
		height = in.nextDouble();
		
		area = width * height;
		perimeter = 2 * (width + height);
		
		System.out.println(area + ", " + perimeter);
		System.out.println(area + "\n" + "" + perimeter);
		System.out.printf("%f, %f\n", area, perimeter);
		
		in.close();
		
	}

}
