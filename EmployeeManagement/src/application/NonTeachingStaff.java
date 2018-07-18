package application;

public class NonTeachingStaff extends Staff {
	private Integer numberOfAdminLeaves;
	
	public NonTeachingStaff(String name) {
		super(name);
		numberOfAdminLeaves = 0;
	}
	public Integer getNumberOfAdminLeaves() {
		return numberOfAdminLeaves;
	}
	
	public void setNumberOfAdminLeaves(Integer numberOfAdminLeaves) {
		this.numberOfAdminLeaves = numberOfAdminLeaves;
	}
	@Override
	public void calculateSalary() {
		System.out.println("Non Teaching Salary");
	}

}
