class BankAccount {
	private String name, account;
	private int balance;
	private static final double interest= 0.23;
	
	//Default 생성자
	public BankAccount() {
		this.name = null;
		this.account = null;
		this.balance = 0;
	}
	
	//이름, 계좌번호, 잔액에 대한 정보가 주어졌을 때에 대한 생성자
	public BankAccount(String name, String account, int balance) {
		this.name = name;
		this.account = account;
		this.balance = balance;
	}
	
	//name에 대한 getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//account에 대한 getter, setter
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
	//balance에 대한 getter, setter
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//상수이므로 getter만 선언
	public double getInterest() {
		return interest;
	}
	
	//toString() 메소드 재정의
	public String toString() {
		return name + " " + account+ " " + balance;
	}
	
}


public class No5_BankAccountTest {

	public static void main(String[] args) {
		
		//BankAccount의 객체 A, B 생성
		BankAccount A = new BankAccount("Dennis", "110-435-815954", 10000);
		BankAccount B = new BankAccount();
		
		//setter Test
		B.setName("Test");
		B.setAccount("000-000-000000");
		B.setBalance(150000);
		
		
		//toString() 메소드를 활용하여 출력 test
		System.out.println(A);
		System.out.println(B);

	}

}
