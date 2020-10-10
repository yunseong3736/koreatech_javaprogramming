import java.util.Scanner; // Scanner 사용을 위해 Scanner 클래스 호출

public class No7 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in); // Scanner 객체를 생성
		final double squareMeter = 3.3058; // 기호상수로 1평당 제곱미터를 저장
		double area;
		int pyeong;
		
		System.out.print("몇 평입니까? ");
		pyeong = s.nextInt(); // 생성한 Scanner 객체로 평 수를 입력 받음
		
		area = pyeong * squareMeter; // 문제에서 제공한 공식으로 제곱미터로 환산
		
		// 연산결과를 출력
		System.out.println(pyeong + "평은 " + area + "제곱미터입니다.");
		
		s.close();
	}

}
