package test4;

//java.lang ��Ű���� �ڵ� import
//java.util ��Ű���� �׷��� �ʴ�.
import java.util.Scanner;

public class Add2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y, sum;
		
		System.out.print("Enter first number : ");
		x = input.nextInt();
		System.out.print("Enter second number : ");
		y = input.nextInt();
		
		sum = x + y;
		System.out.println(sum);
		System.out.println(x + " + " + y + " = " + sum);
		
		input.close();
	}
}
