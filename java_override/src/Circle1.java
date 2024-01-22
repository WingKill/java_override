

class Circle1 {
	private double radius;
	
	public Circle1(double radius) {
		this.radius = radius;
	}
	
	public String toString() {  
		return String.valueOf((int)(radius* radius * Math.PI * 1000) / 1000.0); 
	}
}
