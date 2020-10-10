import java.util.Scanner;

public class No6 {

	public static void main(String[] args) {

		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		String s;
		
		int vowel = 0; // 모음
		int consonant = 0; // 자음
		
		// 문자열 입력
		s = sc.nextLine();
		
		// 문자열의 길이만큼 반복
		for (int i = 0; i < s.length(); i++) {
			
			// 우선적으로 현재 탐색하고 있는 문자가 알파벳인지 확인
			if ( 'A' <= s.charAt(i) && s.charAt(i) <= 'Z' || 'a' <= s.charAt(i) && s.charAt(i) <= 'z')
				switch(s.charAt(i)) {
				//모음일 경우
				case 'a': case 'e': case 'i': case 'o': case 'u': case 'A': case 'E': case 'I': case'O': case 'U':
					vowel++;
					break;
				//아닐 경우
				default:
					consonant++;
					break;
				}
			
		}
		
		// 모음, 자음 개수 출력
		System.out.printf("모음 : %d개, 자음 : %d개\n",vowel,consonant);
		
		
		// 사용이 끝난 Scanner close()
		sc.close();

	}

}
