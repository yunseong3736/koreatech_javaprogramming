import java.util.Scanner;

public class No1 {

	public static void main(String[] args) {

		double divisor, divisor_2, divident, divident_2;
		//divisor, divisor_2 : 분모        divident, divident_2 : 분자
		int loop_count; // 반복횟수
		int[] sum = new int[301]; //소수점 300자리까지를 구하는 배열 sum
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		divisor = 2.0; //분모는 2부터 시작이므로 2로 초기화
		divident = 4.0; //분자는 +4부터 시작이므로 4로 초기화
		System.out.print("반복횟수 : ");
		loop_count = sc.nextInt(); //반복횟수를 입력받음
		
		while(loop_count > 0) { //반복횟수 만큼 반복
			divisor_2 = (divisor * (divisor+1) * (divisor+2)); //ex) 2*3*4, 4*5*6, 6*7*8, ... 을 구현
			divident_2 = divident; //실직적으로 계산되는 분자를 다시 4(혹은 순서에 따라 -4)로 초기화
			
			for (int j=0; j < 300; j++) { //소수점 300자리까지 반복
				divident_2 *= 10; //소수점 한 자리만큼 이동할 때마다 10을 곱해주어 수학적 나눗셈을 구현
				sum[j] += (int)(divident_2 / divisor_2); //해당 소수점 자리에 몫을 더함
				divident_2 %= divisor_2; //몫을 나눈 나머지로 분자를 갱신
			}
			
			for (int j=299; j > 0; j--) { //소수점 300자리에서 첫 째자리까지 역순으로 반복
				
				if(sum[j] >= 10) { //자리 올림을 구현, 10보다 크면 10만큼 빼고 바로 윗자리에 더하기 1
					sum[j] -= 10;
					sum[j-1] += 1;
				}
				if(sum[j] < 0) { //자리 내림을 구현, 0보다 작으면 10만큼 더하고 바로 윗자리에 빼기 1
					sum[j] += 10;
					sum[j-1] -= 1;
				}
				
			}
			
			divident = -1.0 * divident; //+4, -4, +4, -4, +4, ... 을 구현
			divisor = divisor + 2; //분모의 시작 : 2, 4, 6, 8, 10, ... 을 구현
			loop_count--; //반복횟수 만큼 반복 구현
		}
		
		System.out.print("Pi = 3."); //소수점만 구했으므로 3. 을 미리 출력
		for(int j=0; j < 300; j++) { //소수점 300자리까지 출력
			System.out.print(sum[j]);
		}
		
		sc.close(); //다 사용한 객체 close

	}

}
