package application;

public abstract class Staff {

	private String name;
	
	public abstract void calculateSalary();
	
	public Staff() {
		name = "";
	}
	
	public Staff(String name) {
		this.name = name;
	}
	
	public String gatName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
