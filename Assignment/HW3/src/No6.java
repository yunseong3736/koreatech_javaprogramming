import java.util.Scanner;

public class No6 {

	public static void main(String[] args) {

		// Scanner ��ü ����
		Scanner sc = new Scanner(System.in);
		String s;
		
		int vowel = 0; // ����
		int consonant = 0; // ����
		
		// ���ڿ� �Է�
		s = sc.nextLine();
		
		// ���ڿ��� ���̸�ŭ �ݺ�
		for (int i = 0; i < s.length(); i++) {
			
			// �켱������ ���� Ž���ϰ� �ִ� ���ڰ� ���ĺ����� Ȯ��
			if ( 'A' <= s.charAt(i) && s.charAt(i) <= 'Z' || 'a' <= s.charAt(i) && s.charAt(i) <= 'z')
				switch(s.charAt(i)) {
				//������ ���
				case 'a': case 'e': case 'i': case 'o': case 'u': case 'A': case 'E': case 'I': case'O': case 'U':
					vowel++;
					break;
				//�ƴ� ���
				default:
					consonant++;
					break;
				}
			
		}
		
		// ����, ���� ���� ���
		System.out.printf("���� : %d��, ���� : %d��\n",vowel,consonant);
		
		
		// ����� ���� Scanner close()
		sc.close();

	}

}
