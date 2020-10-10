import java.util.Scanner;

public class No5 {

	public static void main(String[] args) {
		
		// Scanner 객체 생성 및 문자열 입력
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		// String클래스의 length()메소드를 이용하여 역순으로 반복하여 출력
		for (int i = str.length() - 1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		
		// StringBuffer 클래스를 이용, reverse()메소드를 이용하여 뒤집기
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse().toString());
		
		// 사용이 끝난 Scanner close()
		sc.close();
		
	}

}
