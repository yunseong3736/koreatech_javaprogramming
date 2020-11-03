package CustomerTest2;

class Person {
	
	//각각 이름, 주소, 전화 번호
	private String name, address, phoneNumber;
	
	//디폴트 생성자
	public Person() {
		//이름, 주소, 전화 번호에 대한 정보가 없으므로 Unknown으로 지정한다.
		name = "Unknown";
		address = "Unknown";
		phoneNumber = "Unknown";
		//디폴트 생성자가 호출됐음을 확인하기 위해 다음과 같이 출력한다.
		System.out.println("Person 클래스의 디폴트 생성자");
	}
	//매개변수가 모두 있는 생성자
	public Person(String name, String address, String phoneNumber) {
		//주어진 이름, 주소, 전화 번호를 필드에 저장한다.
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		//매개변수가 모두 있는 생성자가 호출됐음을 확인하기 위해 다음과 같이 출력한다.
		System.out.println("Person 클래스의 매개변수 있는 생성자");
	}
	
	//필드의 getter, setter
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
	
	//toString() 재정의
	public String toString() {
		return "name : " + name + ", address : " + address + ", phoneNumber : " + phoneNumber;
	}
	
	//equals() 재정의
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
	
	//디폴트 생성자
	public Customer() {
		//부모클래스의 디폴트 생성자 호출한다.
		super();
		//고객 번호와 마일리지에 대한 정보가 없으므로 0으로 지정한다.
		this.customerNumber = 0;
		this.mileage = 0;
		//디폴트 생성자가 호출됐음을 확인하기 위해 다음과 같이 출력한다.
		System.out.println("Customer 클래스의 디폴트 생성자");
	}
	//매개변수가 모두 있는 생성자
	public Customer(String name, String address, String phoneNumber, int customerNumber, int mileage) {
		//부모클래스의 매개변수가 모두 있는 생성자 호출하여 이름, 주소, 전화 번호를 필드에 저장한다.
		super(name, address, phoneNumber);
		//나머지 필드들도 주어진 정보에 따라 저장한다.
		this.customerNumber = customerNumber;
		this.mileage = mileage;
		//매개변수가 모두 있는 생성자가 호출됐음을 확인하기 위해 다음과 같이 출력한다.
		System.out.println("Customer 클래스의 매개변수 있는 생성자");
	}
	
	//필드의 getter, setter
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
	
	//toString() 재정의
	public String toString() {
		//부모클래스의 toString() 호출 후 나머지 필드의 정보를 출력한다.
		return super.toString() + ", CustomerNumber : " + customerNumber + ", Mileage : " + mileage;
	}
	
	//equals() 재정의
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			Customer other = (Customer) obj;
			//부모클래스의 equals() 호출 후 나머지 필드의 정보를 비교한다.
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

		//디폴트 생성자 테스트
		Customer n1 = new Customer();
		
		//n1 객체를 통한 setter 테스트
		n1.setName("조윤성");
		n1.setAddress("대전");
		n1.setPhoneNumber("010-3897-3736");
		n1.setCustomerNumber(1);
		n1.setMileage(100);
		
		//n1 객체의 toString 테스트
		System.out.println("toString() Test\n" + n1);
		System.out.println();
		
		//매개변수 있는 생성자 테스트
		Customer n2 = new Customer("조윤성", "대전", "010-3897-3736", 1, 100);
		
		//n2 객체의 toString 테스트
		System.out.println("toString() Test\n" + n2);
		
		//equals 테스트
		System.out.println("equals() Test\n" + n1.equals(n2));
		
	}

}
