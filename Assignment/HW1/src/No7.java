import java.util.Scanner; // Scanner ����� ���� Scanner Ŭ���� ȣ��

public class No7 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in); // Scanner ��ü�� ����
		final double squareMeter = 3.3058; // ��ȣ����� 1��� �������͸� ����
		double area;
		int pyeong;
		
		System.out.print("�� ���Դϱ�? ");
		pyeong = s.nextInt(); // ������ Scanner ��ü�� �� ���� �Է� ����
		
		area = pyeong * squareMeter; // �������� ������ �������� �������ͷ� ȯ��
		
		// �������� ���
		System.out.println(pyeong + "���� " + area + "���������Դϴ�.");
		
		s.close();
	}

}
