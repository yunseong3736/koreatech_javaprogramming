import java.util.Scanner;

public class No4_Ph_D {

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
