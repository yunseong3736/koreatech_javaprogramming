package test3;

public class StringOperator {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = " World";
		String s3 = s1 + s2;

		System.out.println(s3);
		System.out.printf("%s\n", s3);
		
		int num = 10;
		System.out.println("Num : " + num);
		System.out.println(2 + 3);
		
		System.out.println("string" + 2 + 3);
		System.out.println("string" + (2 + 3));
		
		//�������� ���ڿ������� ��� ���°� ���� �� ���� ��������� �˱�� �˾ƾߵȴٰ� ����Ͻ�.
		System.out.println(2 + 3 + "string" + 2 + 3);
	}

}
