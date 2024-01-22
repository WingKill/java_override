
class Regular extends Employee{ // 정규직
	
	
	public Regular(String name,int age,String address,String department ) {
		super(name,age,address,department);
	}
	
	public void setSalary(int salary) {
		super.setSalary(salary); //월급
	}
	
	public int getSalary() {
		return super.getSalary(); //월급
	}
	
	public void printInfo() {
		System.out.println("정규직");
		System.out.println("월급 : " + super.getSalary());
	}
}
