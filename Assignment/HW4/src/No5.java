class Employee{
	//필드 정의 : 이름, 전화번호, 연봉
	private String name;
	private String phoneNumber;
	private int salary;
	
	//이름에 대한 getter, setter
	public String getName() {
		return this.name;
	}
	public void setName(String obj) {
		this.name = obj;
	}
	
	//전화 번호에 대한 getter, setter
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String obj) {
		this.phoneNumber = obj;
	}
	
	//연봉에 대한 getter, setter
	public int getSalary() {
		return this.salary;
	}
	public void setSalary(int obj) {
		this.salary = obj;
	}
	
	//toString 메소드를 재정의하여 필드 정보를 출력
	public String toString() {
		return "직원 정보\n" + "이름 : " + this.name + " 전화 번호 : " + this.phoneNumber + " 연봉 : " + this.salary;
	}
	
	//equals 메소드를 재정의하여 필드의 값을 비교
	public boolean equals(Employee obj) {
		return (this.name == obj.name) && (this.phoneNumber == obj.phoneNumber);
	}
	
}

class EmployeeTest {
	public void test() {
		//Employee 객체 2개 생성
		Employee A = new Employee();
		Employee B = new Employee();
		
		//setter 메소드 테스트 및 데이터 설정
		A.setName("Dennis");
		A.setPhoneNumber("010-1234-5678");
		A.setSalary(1000);
		
		B.setName("Dennis");
		B.setPhoneNumber("010-1234-5678");
		B.setSalary(1000);
		
		//getter 메소드 테스트
		System.out.println("getName Test");
		System.out.println("A : " + A.getName() + " B : " + B.getName());
		System.out.println("getPhoneNumber Test");
		System.out.println("A : " + A.getPhoneNumber() + " B : " + B.getPhoneNumber());
		System.out.println("getSalary Test");
		System.out.println("A : " + A.getSalary() + " B : " + B.getSalary());
		
		//toString 메소드 테스트
		System.out.println();
		System.out.println("toString Test");
		System.out.println(A);
		System.out.println(B);
		
		//equals 메소드 테스트
		System.out.println();
		System.out.println("equals Test");
		String s = A.equals(B) ? "같은 직원입니다." : "다른 직원입니다.";
		System.out.println(s);
		
	}
}

public class No5 {

	public static void main(String[] args) {
		
		//EmployeeTest 객체를 생성하여 test 메소드 호출을 통해 테스트
		EmployeeTest test = new EmployeeTest();
		test.test();

	}

}
