
public class No8 {

	public static void main(String[] args) {
		
		double distance = 1.5e+8; // 거리를 double형 변수에 지수 표기법으로 표현하여 저장.
		double v = 3e+5; // 물리적 속도를 double형 변수에 지수표기법으로 표현하여 저장.
		
		//'물리적 시간 = 거리 / 속도'  공식을 이용하여 계산
		System.out.println("빛이 태양에서 출발하여 지구에 도착하는 시간 : " + distance/v + "s");
		
	}

}
