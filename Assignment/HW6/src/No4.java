import java.util.Scanner;

class ToBinary {
	private String hexa; //16������ ���ڿ�
	//16������ '0'���� 'f'
	private String [] htb = {"0000","0001","0010","0011",
							 "0100","0101","0110","0111",
							 "1000","1001","1010","1011",
							 "1100","1101","1110","1111"};
	//�����ڸ� ���� ���޹��� String���� 16������ ���ڿ� �ʱ�ȭ
	public ToBinary(String s) {
		hexa = s;
	}
	
	//16�������� 2������ ��ȯ�ϴ� �޼ҵ�
	public String htob() {
		String result = ""; //����� �����ϴ� String
		result += "\""+hexa+"\"�� ���� �������� "; //���� ������ ����� �߰�
		for (int i=0; i<hexa.length(); i++) { //16������ ���ڿ� ũ�⸸ŭ �ݺ�
			
			//���ڿ� �ش��ϴ� ���
			if (hexa.charAt(i) >= '0' && hexa.charAt(i) <= '9') result += htb[hexa.charAt(i)-'0']+" ";
			//���ĺ��� �ش��ϴ� ���
			else result += htb[hexa.charAt(i)-'a'+10]+" ";
			
		}
		result += "�Դϴ�.";
		
		return result; //��� return
	}
}

public class No4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); //Scanner Ŭ������ ��ü����
		
		System.out.print("16���� ���ڿ��� �Է��Ͻÿ�(���ĺ��� �ҹ���) : "); //���� ���� ���
		ToBinary test = new ToBinary(in.next()); //16������ ���ڿ� �Է°� ���ÿ� ToBinary Ŭ������ ��ü����
		System.out.println(test.htob()); //htob()�޼ҵ� ȣ��� ���ÿ� ���
		
		in.close(); //����� ���� Scanner��ü ����
		
	}

}
