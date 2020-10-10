class Employee{
	//�ʵ� ���� : �̸�, ��ȭ��ȣ, ����
	private String name;
	private String phoneNumber;
	private int salary;
	
	//�̸��� ���� getter, setter
	public String getName() {
		return this.name;
	}
	public void setName(String obj) {
		this.name = obj;
	}
	
	//��ȭ ��ȣ�� ���� getter, setter
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String obj) {
		this.phoneNumber = obj;
	}
	
	//������ ���� getter, setter
	public int getSalary() {
		return this.salary;
	}
	public void setSalary(int obj) {
		this.salary = obj;
	}
	
	//toString �޼ҵ带 �������Ͽ� �ʵ� ������ ���
	public String toString() {
		return "���� ����\n" + "�̸� : " + this.name + " ��ȭ ��ȣ : " + this.phoneNumber + " ���� : " + this.salary;
	}
	
	//equals �޼ҵ带 �������Ͽ� �ʵ��� ���� ��
	public boolean equals(Employee obj) {
		return (this.name == obj.name) && (this.phoneNumber == obj.phoneNumber);
	}
	
}

class EmployeeTest {
	public void test() {
		//Employee ��ü 2�� ����
		Employee A = new Employee();
		Employee B = new Employee();
		
		//setter �޼ҵ� �׽�Ʈ �� ������ ����
		A.setName("Dennis");
		A.setPhoneNumber("010-1234-5678");
		A.setSalary(1000);
		
		B.setName("Dennis");
		B.setPhoneNumber("010-1234-5678");
		B.setSalary(1000);
		
		//getter �޼ҵ� �׽�Ʈ
		System.out.println("getName Test");
		System.out.println("A : " + A.getName() + " B : " + B.getName());
		System.out.println("getPhoneNumber Test");
		System.out.println("A : " + A.getPhoneNumber() + " B : " + B.getPhoneNumber());
		System.out.println("getSalary Test");
		System.out.println("A : " + A.getSalary() + " B : " + B.getSalary());
		
		//toString �޼ҵ� �׽�Ʈ
		System.out.println();
		System.out.println("toString Test");
		System.out.println(A);
		System.out.println(B);
		
		//equals �޼ҵ� �׽�Ʈ
		System.out.println();
		System.out.println("equals Test");
		String s = A.equals(B) ? "���� �����Դϴ�." : "�ٸ� �����Դϴ�.";
		System.out.println(s);
		
	}
}

public class No5 {

	public static void main(String[] args) {
		
		//EmployeeTest ��ü�� �����Ͽ� test �޼ҵ� ȣ���� ���� �׽�Ʈ
		EmployeeTest test = new EmployeeTest();
		test.test();

	}

}
