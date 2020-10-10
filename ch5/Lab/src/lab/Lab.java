package lab;

import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {
		boolean isCapital;
		int citizens, riches;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("수도?(true, false) : ");
		isCapital = sc.nextBoolean();
		
		System.out.println("인구(단위 : 백만) : ");
		citizens = sc.nextInt();
		System.out.println("부자의 수(단위 : 백만) : ");
		riches = sc.nextInt();
		
		boolean isMetro = (isCapital && citizens > 100) || (riches > 50);
		System.out.println("매트로폴리스 여부 : "+isMetro);
		
		sc.close();

	}

}
