package Programming;

import java.util.Scanner;

public class No4 {

	public static void main(String[] args) {
		String[] hexa2bin = {"0000","0001","0010","0011",
				"0100","0101","0110","0111",
				"1000","1001","1010","1011",
				"1100","1101","1110","1111"};
		String hexa;
		String bin = "";
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hexadecimal number : ");
		hexa = sc.next();
		hexa = hexa.toLowerCase();
		
		for(int i =0; i<hexa.length();i++) {
			char ch = hexa.charAt(i);
			num = Character.getNumericValue(ch);
			
			System.out.println(num);
			bin += hexa2bin[num] + " ";
		}
		System.out.println(bin);
		sc.close();

	}

}
// 교수님께서 이렇게 예시를 제시하셨다. 위와 같은 코딩스타일은 절차지향적 코딩스타일이니까 클래스를 만들라고 하셨음.
// 결국 과제는 잘했다. 과제와 이 소스를 합치면 좋을 것 같다.