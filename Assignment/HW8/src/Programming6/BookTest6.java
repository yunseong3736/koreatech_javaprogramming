package Programming6;


abstract class Book {
	//관리번호(number), 제목(title), 저자(author)
	private int number;
	private String title, author;
	
	//매개변수가 모두 있는 생성자
	public Book(int number, String title, String author) {
		this.number = number;
		this.title = title;
		this.author = author;
	}
	
	//관리번호, 제목, 저자에 대한 getter/setter
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
	
	//Object 클래스의 equals() 메소드 재정의
	public boolean equals(Object obj) {
		//만약 Book객체가 아니라면
		if (!(obj instanceof Book)) {
			//책이 아니라는 것을 출력 후, false 반환
			System.out.println("It is not Book");
			return false;
		}

		//다형성을 이용하여 비교
		//obj를 Book으로 형변환
		Book other = (Book) obj;
		//관리번호가 같다면
		if (this.number == other.number) {
			//같은 책
			System.out.println("Same Book");
			return true;
		}
		//관리번호가 다르다면
		else {
			//다른 책
			System.out.println("Different Book");
			return false;
		}
	}
	
	public abstract int getLateFees(int late); //추상 메소드 선언
	
}

class Novel extends Book {
	
	public Novel(int number, String title, String author) {
		//부모의 생성자 호출
		super(number, title, author);
	}
	
	//추상 메소드 구현
	@Override
	public int getLateFees(int late) {
		return late * 300;
	}
	
}

class Poet extends Book {
	
	public Poet(int number, String title, String author) {
		//부모의 생성자 호출
		super(number, title, author);
	}
	
	//추상 메소드 구현
	@Override
	public int getLateFees(int late) {
		return late * 200;
	}
	
}

class ScienceFiction extends Book {
	
	public ScienceFiction(int number, String title, String author) {
		//부모의 생성자 호출
		super(number, title, author);
	}

	//추상 메소드 구현
	@Override
	public int getLateFees(int late) {
		return late * 600;
	}
	
}

public class BookTest6 {

	public static void main(String[] args) {

		//상향 형변환
		Book b1 = new Novel(1, "TO KILL A MOCKINGBIRD", "Harper Lee");
		Book b2 = new Novel(1, "TO KILL A MOCKINGBIRD", "Harper Lee");
		Book b3 = new Poet(2, "Shakespeare's Sonnets", "William Shakespeare");
		Book b4 = new ScienceFiction(3, "The Martian", "Andy Weir");
		
		System.out.println("equals method test");
		b1.equals(b2);
		b2.equals(b3);
		b3.equals(b4);
		System.out.println();
		//동적 바인딩을 사용하여 연체료 계산
		System.out.println("getLateFees method test");
		System.out.println(b1.getTitle() + " : " + b1.getLateFees(10));
		System.out.println(b3.getTitle() + " : " + b3.getLateFees(10));
		System.out.println(b4.getTitle() + " : " + b4.getLateFees(10));
		
	}

}