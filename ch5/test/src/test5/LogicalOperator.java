package test5;

public class LogicalOperator {

	public static void main(String[] args) {
		int x=3;
		int y=4;
		
		System.out.println((x==3) && (y==7));
		System.out.println((x==4) || (y==4));
		
		//Short circuit�� ���ؼ� �ڷ� ���� �ʴ� ����
		//�Ʒ��� ���� �ڵ��� �� ���� ����.
		//�׷��� ��� ���ư������� �˾ƾ� ��.
		//���� �̷������� �ڵ����� �� ��.
		System.out.println((x==4) && (++y == 4));
		System.out.println(x + ", " + y);
		System.out.println();
		System.out.println();

	}

}
