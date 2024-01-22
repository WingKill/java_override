
class Employee {
	private String name; // 이름
	private int age; // 나이
	private String address; // 주소
	private String department; // 부서
	private int salary; //월급
	
	public Employee(String name,int age,String address,String department ) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.department = department;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("부서 : " + department);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
