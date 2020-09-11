package programming.prog2;

import java.util.Scanner;

public class prog2 {

	public static void main(String[] args) {

		double r , v;
		Scanner in = new Scanner(System.in);

		System.out.print("반지름을 입력하시오 : ");
		r = in.nextDouble();
		
		v = 4.0 / 3 * Math.pow(r, 3);
		
		System.out.printf("부피는 %.2f입니다.\n", v);
		
		in.close();
		
	}

}
