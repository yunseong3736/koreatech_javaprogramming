package test5;

public class LogicalOperator {

	public static void main(String[] args) {
		int x=3;
		int y=4;
		
		System.out.println((x==3) && (y==7));
		System.out.println((x==4) || (y==4));
		
		//Short circuit에 의해서 뒤로 가지 않는 현상
		//아래와 같은 코딩은 안 좋은 예임.
		//그래도 어떻게 돌아가는지는 알아야 함.
		//절대 이런식으로 코딩하지 말 것.
		System.out.println((x==4) && (++y == 4));
		System.out.println(x + ", " + y);
		System.out.println();
		System.out.println();

	}

}
