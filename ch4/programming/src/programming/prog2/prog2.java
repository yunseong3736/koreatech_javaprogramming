package programming.prog2;

import java.util.Scanner;

public class prog2 {

	public static void main(String[] args) {

		double r , v;
		Scanner in = new Scanner(System.in);

		System.out.print("�������� �Է��Ͻÿ� : ");
		r = in.nextDouble();
		
		v = 4.0 / 3 * Math.pow(r, 3);
		
		System.out.printf("���Ǵ� %.2f�Դϴ�.\n", v);
		
		in.close();
		
	}

}
