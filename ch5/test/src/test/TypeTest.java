package test;

public class TypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
		long num1 = 200L;
		
		
		short s1 = 100;
		short s2 = 200;
		short s3 = (short)(s1 + s2); // ������ ��� ������ int������ ��ȯ�ȴ�. �׷��Ƿ� ����ȯ�� �ʿ��ϴ�.
		
		byte b1 = 10;
		byte b2 = (byte)(-b1); // ��ȣ���� ����� int�� ��ȯ�ȴ�. ���������� ����ȯ �ʿ�
		
		long l1 = 100 + 200L;
		
		int i = 26;
		int oi = 032;
		int xi = 0x1a;
		int xb = 0b1101;
		System.out.println(i + ", " + oi + ", " + xi + ", " + xb);
		
		i = 123_456_789; // �� �������� �ʴ´�.
		System.out.println(i);
	}

}
