import java.util.Scanner;

public class No1 {

	public static void main(String[] args) {

		double divisor, divisor_2, divident, divident_2;
		//divisor, divisor_2 : �и�        divident, divident_2 : ����
		int loop_count; // �ݺ�Ƚ��
		int[] sum = new int[301]; //�Ҽ��� 300�ڸ������� ���ϴ� �迭 sum
		Scanner sc = new Scanner(System.in); //Scanner ��ü ����
		divisor = 2.0; //�и�� 2���� �����̹Ƿ� 2�� �ʱ�ȭ
		divident = 4.0; //���ڴ� +4���� �����̹Ƿ� 4�� �ʱ�ȭ
		System.out.print("�ݺ�Ƚ�� : ");
		loop_count = sc.nextInt(); //�ݺ�Ƚ���� �Է¹���
		
		while(loop_count > 0) { //�ݺ�Ƚ�� ��ŭ �ݺ�
			divisor_2 = (divisor * (divisor+1) * (divisor+2)); //ex) 2*3*4, 4*5*6, 6*7*8, ... �� ����
			divident_2 = divident; //���������� ���Ǵ� ���ڸ� �ٽ� 4(Ȥ�� ������ ���� -4)�� �ʱ�ȭ
			
			for (int j=0; j < 300; j++) { //�Ҽ��� 300�ڸ����� �ݺ�
				divident_2 *= 10; //�Ҽ��� �� �ڸ���ŭ �̵��� ������ 10�� �����־� ������ �������� ����
				sum[j] += (int)(divident_2 / divisor_2); //�ش� �Ҽ��� �ڸ��� ���� ����
				divident_2 %= divisor_2; //���� ���� �������� ���ڸ� ����
			}
			
			for (int j=299; j > 0; j--) { //�Ҽ��� 300�ڸ����� ù °�ڸ����� �������� �ݺ�
				
				if(sum[j] >= 10) { //�ڸ� �ø��� ����, 10���� ũ�� 10��ŭ ���� �ٷ� ���ڸ��� ���ϱ� 1
					sum[j] -= 10;
					sum[j-1] += 1;
				}
				if(sum[j] < 0) { //�ڸ� ������ ����, 0���� ������ 10��ŭ ���ϰ� �ٷ� ���ڸ��� ���� 1
					sum[j] += 10;
					sum[j-1] -= 1;
				}
				
			}
			
			divident = -1.0 * divident; //+4, -4, +4, -4, +4, ... �� ����
			divisor = divisor + 2; //�и��� ���� : 2, 4, 6, 8, 10, ... �� ����
			loop_count--; //�ݺ�Ƚ�� ��ŭ �ݺ� ����
		}
		
		System.out.print("Pi = 3."); //�Ҽ����� �������Ƿ� 3. �� �̸� ���
		for(int j=0; j < 300; j++) { //�Ҽ��� 300�ڸ����� ���
			System.out.print(sum[j]);
		}
		
		sc.close(); //�� ����� ��ü close

	}

}
