package programming.prog9;

import java.util.Scanner;

public class prog9 {

	public static void main(String[] args) {
		
		int money, cost;
		Scanner in = new Scanner(System.in);
		
		System.out.print("���� �� : ");
		money = in.nextInt();
		System.out.print("��ǰ�� �Ѿ� : ");
		cost = in.nextInt();
		
		System.out.println("�ΰ��� : " + Math.round(cost * 0.1));
		System.out.println("�ܵ� : " + (money - cost));
		
		in.close();

	}

}
