package test4;

public class Ex4 {

	public static void main(String[] args) {
		int x=10, y=2,z=2;
		
		z = ++x / y;
		System.out.println(x + " " + y + " " + z);
		x *= y + 1; // x = x*(y+1)
		System.out.println(x + " " + y + " " + z);
		z = ++x + y++;
		System.out.println(x + " " + y + " " + z);

	}

}
