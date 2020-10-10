class Movie{
	
	// 각각 영화 제목, 평점, 감독, 년도
	private String name;
	private double rate;
	private String director;
	private int year;
	
	
	// 각각의 변수에 대한 getter, setter 정의
	public String getName() { return name; }
	public void setName(String obj) { name = obj; }
	
	public double getRate() { return rate; }
	public void setRate(double obj) { rate = obj; }
	
	public String getDirector() { return director; }
	public void setDirector(String obj) { director = obj; }
	
	public int getYear() { return year; }
	public void setYear(int obj) { year = obj; }
	
	
	// 영화의 모든 정보를 출력하는 print()메소드 정의
	public void print() {
		System.out.println("영화 제목 : " + name);
		System.out.println("영화 평점 : " + rate);
		System.out.println("영화 감독 : " + director);
		System.out.println("발표된 연도 : " + year);
	}
	
}


public class No4 {

	public static void main(String[] args) {
		
		Movie movie = new Movie(); // Movie 클래스의 객체 생성
		
		// setter를 통해 영화 제목, 평점, 감독, 년도를 설정
		movie.setName("Central Intelligence");
		movie.setRate(4.8);
		movie.setDirector("Rawson Marshall Thurber");
		movie.setYear(2016);

		// print()메소드를 통해 정보 출력
		movie.print();
		
	}

}
