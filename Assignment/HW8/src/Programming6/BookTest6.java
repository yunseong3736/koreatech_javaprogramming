package Programming6;


abstract class Book {
	//������ȣ(number), ����(title), ����(author)
	private int number;
	private String title, author;
	
	//�Ű������� ��� �ִ� ������
	public Book(int number, String title, String author) {
		this.number = number;
		this.title = title;
		this.author = author;
	}
	
	//������ȣ, ����, ���ڿ� ���� getter/setter
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//Object Ŭ������ equals() �޼ҵ� ������
	public boolean equals(Object obj) {
		//���� Book��ü�� �ƴ϶��
		if (!(obj instanceof Book)) {
			//å�� �ƴ϶�� ���� ��� ��, false ��ȯ
			System.out.println("It is not Book");
			return false;
		}

		//�������� �̿��Ͽ� ��
		//obj�� Book���� ����ȯ
		Book other = (Book) obj;
		//������ȣ�� ���ٸ�
		if (this.number == other.number) {
			//���� å
			System.out.println("Same Book");
			return true;
		}
		//������ȣ�� �ٸ��ٸ�
		else {
			//�ٸ� å
			System.out.println("Different Book");
			return false;
		}
	}
	
	public abstract int getLateFees(int late); //�߻� �޼ҵ� ����
	
}

class Novel extends Book {
	
	public Novel(int number, String title, String author) {
		//�θ��� ������ ȣ��
		super(number, title, author);
	}
	
	//�߻� �޼ҵ� ����
	@Override
	public int getLateFees(int late) {
		return late * 300;
	}
	
}

class Poet extends Book {
	
	public Poet(int number, String title, String author) {
		//�θ��� ������ ȣ��
		super(number, title, author);
	}
	
	//�߻� �޼ҵ� ����
	@Override
	public int getLateFees(int late) {
		return late * 200;
	}
	
}

class ScienceFiction extends Book {
	
	public ScienceFiction(int number, String title, String author) {
		//�θ��� ������ ȣ��
		super(number, title, author);
	}

	//�߻� �޼ҵ� ����
	@Override
	public int getLateFees(int late) {
		return late * 600;
	}
	
}

public class BookTest6 {

	public static void main(String[] args) {

		//���� ����ȯ
		Book b1 = new Novel(1, "TO KILL A MOCKINGBIRD", "Harper Lee");
		Book b2 = new Novel(1, "TO KILL A MOCKINGBIRD", "Harper Lee");
		Book b3 = new Poet(2, "Shakespeare's Sonnets", "William Shakespeare");
		Book b4 = new ScienceFiction(3, "The Martian", "Andy Weir");
		
		System.out.println("equals method test");
		b1.equals(b2);
		b2.equals(b3);
		b3.equals(b4);
		System.out.println();
		//���� ���ε��� ����Ͽ� ��ü�� ���
		System.out.println("getLateFees method test");
		System.out.println(b1.getTitle() + " : " + b1.getLateFees(10));
		System.out.println(b3.getTitle() + " : " + b3.getLateFees(10));
		System.out.println(b4.getTitle() + " : " + b4.getLateFees(10));
		
	}

}