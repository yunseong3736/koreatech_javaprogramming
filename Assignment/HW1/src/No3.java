import java.util.Scanner; // Scanner 사용을 위해 Scanner 클래스 호출

public class No3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // Scanner 객체를 생성
		double height, inch;
		int feet;
		
		System.out.print("키를 입력하시오 : ");
		height = s.nextDouble(); // 생성한 Scanner 객체로 Double형 값을 하나 입력 받음
		
		inch = height / 2.54; // cm를 inch로 변환
		feet = (int)inch / 12; // inch를 12로 나누어 떨어지는 만큼 feet로 변환
		inch = inch % 12; // inch를 12로 나눈 나머지로 변경
		
		//연산 결과를 출력
		System.out.println(height + "cm는 " + feet + "피트 " + inch + "인치입니다.");
		
		s.close();

	}

}
