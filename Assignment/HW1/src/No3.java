import java.util.Scanner; // Scanner ����� ���� Scanner Ŭ���� ȣ��

public class No3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // Scanner ��ü�� ����
		double height, inch;
		int feet;
		
		System.out.print("Ű�� �Է��Ͻÿ� : ");
		height = s.nextDouble(); // ������ Scanner ��ü�� Double�� ���� �ϳ� �Է� ����
		
		inch = height / 2.54; // cm�� inch�� ��ȯ
		feet = (int)inch / 12; // inch�� 12�� ������ �������� ��ŭ feet�� ��ȯ
		inch = inch % 12; // inch�� 12�� ���� �������� ����
		
		//���� ����� ���
		System.out.println(height + "cm�� " + feet + "��Ʈ " + inch + "��ġ�Դϴ�.");
		
		s.close();

	}

}
