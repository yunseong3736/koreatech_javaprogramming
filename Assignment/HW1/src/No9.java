import java.util.Scanner; // Scanner ����� ���� Scanner Ŭ���� ȣ��

public class No9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ��ü�� ����
		double p, s; // ���� ������ ���� ���� ����
		double pressure; // �з¿� ���� ���� ����
		
		System.out.print("��ü�� �־��� ���� ��ü�� ������ �Է��Ͻÿ� : (���� N, m^2) ");
		p = sc.nextDouble(); // ������ Scanner ��ü�� ��ü�� �־��� ���� �Է� ����
		s = sc.nextDouble(); // ������ Scanner ��ü�� ��ü�� ������ �Է� ����
		
		pressure = p/s; //������ �־��� �з��� ���⸦ ���ϴ� ���� ����

		// ���� ����� ���
		System.out.println("�з��� ���� : " + pressure + "Pa");
		
		sc.close();
		
	}

}
