import java.util.Scanner; // Scanner 사용을 위해 Scanner 클래스 호출

public class No9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 객체를 생성
		double p, s; // 힘과 면적에 대한 변수 선언
		double pressure; // 압력에 대한 변수 선언
		
		System.out.print("물체에 주어진 힘과 물체의 면적을 입력하시오 : (단위 N, m^2) ");
		p = sc.nextDouble(); // 생성한 Scanner 객체로 물체에 주어진 힘을 입력 받음
		s = sc.nextDouble(); // 생성한 Scanner 객체로 물체의 면적을 입력 받음
		
		pressure = p/s; //문제에 주어진 압력의 세기를 구하는 공식 적용

		// 연산 결과를 출력
		System.out.println("압력의 세기 : " + pressure + "Pa");
		
		sc.close();
		
	}

}
