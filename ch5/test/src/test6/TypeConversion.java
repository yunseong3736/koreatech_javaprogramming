package test6;

public class TypeConversion {

	public static void main(String[] args) {
		int i;
		double d;
		
		d = 5 / 4;
		System.out.println(d);
		d = (double)5 / 4;
		System.out.println(d);
		d = 5 / 4.0;
		System.out.println(d);
		
		i = (int)1.3 + (int)2.8;
		System.out.println(i);
		
		i = (int)(1.3 + 2.8);
		System.out.println(i);
		
		d = 100;
		i = (int)100.5;
		// i = 10 + 1.3 + 1.8; // type mismatch error

	}

}
