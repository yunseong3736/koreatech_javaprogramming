class Movie{
	
	// ���� ��ȭ ����, ����, ����, �⵵
	private String name;
	private double rate;
	private String director;
	private int year;
	
	
	// ������ ������ ���� getter, setter ����
	public String getName() { return name; }
	public void setName(String obj) { name = obj; }
	
	public double getRate() { return rate; }
	public void setRate(double obj) { rate = obj; }
	
	public String getDirector() { return director; }
	public void setDirector(String obj) { director = obj; }
	
	public int getYear() { return year; }
	public void setYear(int obj) { year = obj; }
	
	
	// ��ȭ�� ��� ������ ����ϴ� print()�޼ҵ� ����
	public void print() {
		System.out.println("��ȭ ���� : " + name);
		System.out.println("��ȭ ���� : " + rate);
		System.out.println("��ȭ ���� : " + director);
		System.out.println("��ǥ�� ���� : " + year);
	}
	
}


public class No4 {

	public static void main(String[] args) {
		
		Movie movie = new Movie(); // Movie Ŭ������ ��ü ����
		
		// setter�� ���� ��ȭ ����, ����, ����, �⵵�� ����
		movie.setName("Central Intelligence");
		movie.setRate(4.8);
		movie.setDirector("Rawson Marshall Thurber");
		movie.setYear(2016);

		// print()�޼ҵ带 ���� ���� ���
		movie.print();
		
	}

}
