package CustomerTest2;

class Person {
	
	//���� �̸�, �ּ�, ��ȭ ��ȣ
	private String name, address, phoneNumber;
	
	//����Ʈ ������
	public Person() {
		//�̸�, �ּ�, ��ȭ ��ȣ�� ���� ������ �����Ƿ� Unknown���� �����Ѵ�.
		name = "Unknown";
		address = "Unknown";
		phoneNumber = "Unknown";
		//����Ʈ �����ڰ� ȣ������� Ȯ���ϱ� ���� ������ ���� ����Ѵ�.
		System.out.println("Person Ŭ������ ����Ʈ ������");
	}
	//�Ű������� ��� �ִ� ������
	public Person(String name, String address, String phoneNumber) {
		//�־��� �̸�, �ּ�, ��ȭ ��ȣ�� �ʵ忡 �����Ѵ�.
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		//�Ű������� ��� �ִ� �����ڰ� ȣ������� Ȯ���ϱ� ���� ������ ���� ����Ѵ�.
		System.out.println("Person Ŭ������ �Ű����� �ִ� ������");
	}
	
	//�ʵ��� getter, setter
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//toString() ������
	public String toString() {
		return "name : " + name + ", address : " + address + ", phoneNumber : " + phoneNumber;
	}
	
	//equals() ������
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person other = (Person)obj;
			if (name.equals(other.name) && address.equals(other.address) && phoneNumber.equals(other.phoneNumber)) return true;
			else return false;
		}
		else return false;
	}
	
}

class Customer extends Person {
	
	private int customerNumber, mileage;
	
	//����Ʈ ������
	public Customer() {
		//�θ�Ŭ������ ����Ʈ ������ ȣ���Ѵ�.
		super();
		//�� ��ȣ�� ���ϸ����� ���� ������ �����Ƿ� 0���� �����Ѵ�.
		this.customerNumber = 0;
		this.mileage = 0;
		//����Ʈ �����ڰ� ȣ������� Ȯ���ϱ� ���� ������ ���� ����Ѵ�.
		System.out.println("Customer Ŭ������ ����Ʈ ������");
	}
	//�Ű������� ��� �ִ� ������
	public Customer(String name, String address, String phoneNumber, int customerNumber, int mileage) {
		//�θ�Ŭ������ �Ű������� ��� �ִ� ������ ȣ���Ͽ� �̸�, �ּ�, ��ȭ ��ȣ�� �ʵ忡 �����Ѵ�.
		super(name, address, phoneNumber);
		//������ �ʵ�鵵 �־��� ������ ���� �����Ѵ�.
		this.customerNumber = customerNumber;
		this.mileage = mileage;
		//�Ű������� ��� �ִ� �����ڰ� ȣ������� Ȯ���ϱ� ���� ������ ���� ����Ѵ�.
		System.out.println("Customer Ŭ������ �Ű����� �ִ� ������");
	}
	
	//�ʵ��� getter, setter
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	//toString() ������
	public String toString() {
		//�θ�Ŭ������ toString() ȣ�� �� ������ �ʵ��� ������ ����Ѵ�.
		return super.toString() + ", CustomerNumber : " + customerNumber + ", Mileage : " + mileage;
	}
	
	//equals() ������
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			Customer other = (Customer) obj;
			//�θ�Ŭ������ equals() ȣ�� �� ������ �ʵ��� ������ ���Ѵ�.
			if (super.equals(obj) && this.customerNumber == other.customerNumber && this.mileage == other.mileage) {
				return true;
			}
			else return false;
		}
		else return false;
	}
	
}

public class CustomerTest2 {

	public static void main(String[] args) {

		//����Ʈ ������ �׽�Ʈ
		Customer n1 = new Customer();
		
		//n1 ��ü�� ���� setter �׽�Ʈ
		n1.setName("������");
		n1.setAddress("����");
		n1.setPhoneNumber("010-3897-3736");
		n1.setCustomerNumber(1);
		n1.setMileage(100);
		
		//n1 ��ü�� toString �׽�Ʈ
		System.out.println("toString() Test\n" + n1);
		System.out.println();
		
		//�Ű����� �ִ� ������ �׽�Ʈ
		Customer n2 = new Customer("������", "����", "010-3897-3736", 1, 100);
		
		//n2 ��ü�� toString �׽�Ʈ
		System.out.println("toString() Test\n" + n2);
		
		//equals �׽�Ʈ
		System.out.println("equals() Test\n" + n1.equals(n2));
		
	}

}
