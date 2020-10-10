import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double divisor, divisor_2, divident, divident_2;
		int loop_count;
		int[] sum = new int[301];
		
		Scanner sc = new Scanner(System.in);
		divisor = 2.0;
		divident = 4.0;
		System.out.print("¹Ýº¹È½¼ö : ");
		loop_count = sc.nextInt();
		
		while(loop_count > 0) {
			divisor_2 = (divisor * (divisor+1) * (divisor+2));
			divident_2 = divident;
			
			for (int j=0; j < 300; j++) {
				divident_2 *= 10;
				sum[j] += (int)(divident_2 / divisor_2);
				divident_2 %= divisor_2;
			}
			
			for (int j=299; j > 0; j--) {
				
				if(sum[j] >= 10) {
					sum[j] -= 10;
					sum[j-1] += 1;
				}
				if(sum[j] < 0) {
					sum[j] += 10;
					sum[j-1] -= 1;
				}
				
			}
			
			divident = -1.0 * divident;
			divisor = divisor + 2;
			loop_count--;
		}
		
		System.out.print("Pi = 3.");
		for(int j=0; j < 300; j++) {
			System.out.print(sum[j]);
		}
		
		sc.close();
		
	}

}
