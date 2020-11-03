class BankAccount {
	private String name, account;
	private int balance;
	private static final double interest= 0.23;
	
	//Default ������
	public BankAccount() {
		this.name = null;
		this.account = null;
		this.balance = 0;
	}
	
	//�̸�, ���¹�ȣ, �ܾ׿� ���� ������ �־����� ���� ���� ������
	public BankAccount(String name, String account, int balance) {
		this.name = name;
		this.account = account;
		this.balance = balance;
	}
	
	//name�� ���� getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//account�� ���� getter, setter
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
	//balance�� ���� getter, setter
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//����̹Ƿ� getter�� ����
	public double getInterest() {
		return interest;
	}
	
	//toString() �޼ҵ� ������
	public String toString() {
		return name + " " + account+ " " + balance;
	}
	
}


public class No5_BankAccountTest {

	public static void main(String[] args) {
		
		//BankAccount�� ��ü A, B ����
		BankAccount A = new BankAccount("Dennis", "110-435-815954", 10000);
		BankAccount B = new BankAccount();
		
		//setter Test
		B.setName("Test");
		B.setAccount("000-000-000000");
		B.setBalance(150000);
		
		
		//toString() �޼ҵ带 Ȱ���Ͽ� ��� test
		System.out.println(A);
		System.out.println(B);

	}

}
