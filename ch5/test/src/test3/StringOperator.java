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
		
		//산숭연산과 문자열연산을 섞어서 쓰는건 정말 안 좋은 방법이지만 알기는 알아야된다고 언급하심.
		System.out.println(2 + 3 + "string" + 2 + 3);
	}

}
