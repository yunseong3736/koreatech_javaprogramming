import java.util.Scanner;

public class No5 {

	public static void main(String[] args) {
		
		// Scanner ��ü ���� �� ���ڿ� �Է�
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		// StringŬ������ length()�޼ҵ带 �̿��Ͽ� �������� �ݺ��Ͽ� ���
		for (int i = str.length() - 1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		
		// StringBuffer Ŭ������ �̿�, reverse()�޼ҵ带 �̿��Ͽ� ������
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse().toString());
		
		// ����� ���� Scanner close()
		sc.close();
		
	}

}
