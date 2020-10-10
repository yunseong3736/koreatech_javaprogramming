package test;

public class TypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
		long num1 = 200L;
		
		
		short s1 = 100;
		short s2 = 200;
		short s3 = (short)(s1 + s2); // 정수형 산술 연산은 int형으로 변환된다. 그러므로 형변환이 필요하다.
		
		byte b1 = 10;
		byte b2 = (byte)(-b1); // 부호연산 결과는 int로 변환된다. 마찬가지로 형변환 필요
		
		long l1 = 100 + 200L;
		
		int i = 26;
		int oi = 032;
		int xi = 0x1a;
		int xb = 0b1101;
		System.out.println(i + ", " + oi + ", " + xi + ", " + xb);
		
		i = 123_456_789; // 잘 쓰이지는 않는다.
		System.out.println(i);
	}

}
