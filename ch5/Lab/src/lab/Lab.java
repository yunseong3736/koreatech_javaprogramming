package lab;

import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {
		boolean isCapital;
		int citizens, riches;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("����?(true, false) : ");
		isCapital = sc.nextBoolean();
		
		System.out.println("�α�(���� : �鸸) : ");
		citizens = sc.nextInt();
		System.out.println("������ ��(���� : �鸸) : ");
		riches = sc.nextInt();
		
		boolean isMetro = (isCapital && citizens > 100) || (riches > 50);
		System.out.println("��Ʈ�������� ���� : "+isMetro);
		
		sc.close();

	}

}
