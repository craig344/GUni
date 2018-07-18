package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Staff staff1 = new TeachingStaff("Craig");
		Staff staff2 = new NonTeachingStaff("Anish");
		
		staff1.calculateSalary();
		System.out.println(staff1.gatName());
		staff2.calculateSalary();
		System.out.println(staff2.gatName());

	}

}
