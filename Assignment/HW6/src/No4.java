import java.util.Scanner;

class ToBinary {
	private String hexa; //16진수의 문자열
	//16진수의 '0'부터 'f'
	private String [] htb = {"0000","0001","0010","0011",
							 "0100","0101","0110","0111",
							 "1000","1001","1010","1011",
							 "1100","1101","1110","1111"};
	//생성자를 통해 전달받은 String으로 16진수의 문자열 초기화
	public ToBinary(String s) {
		hexa = s;
	}
	
	//16진수에서 2진수로 변환하는 메소드
	public String htob() {
		String result = ""; //결과를 저장하는 String
		result += "\""+hexa+"\"에 대한 이진수는 "; //기초 정보를 결과에 추가
		for (int i=0; i<hexa.length(); i++) { //16진수의 문자열 크기만큼 반복
			
			//숫자에 해당하는 경우
			if (hexa.charAt(i) >= '0' && hexa.charAt(i) <= '9') result += htb[hexa.charAt(i)-'0']+" ";
			//알파벳에 해당하는 경우
			else result += htb[hexa.charAt(i)-'a'+10]+" ";
			
		}
		result += "입니다.";
		
		return result; //결과 return
	}
}

public class No4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); //Scanner 클래스의 객체생성
		
		System.out.print("16진수 문자열을 입력하시오(알파벳은 소문자) : "); //기초 정보 출력
		ToBinary test = new ToBinary(in.next()); //16진수의 문자열 입력과 동시에 ToBinary 클래스의 객체생성
		System.out.println(test.htob()); //htob()메소드 호출과 동시에 출력
		
		in.close(); //사용이 끝난 Scanner객체 정리
		
	}

}
