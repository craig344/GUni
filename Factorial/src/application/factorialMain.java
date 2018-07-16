package application;

public class factorialMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial factor = new factorial();
		factor.setN(5);
		int f = factor.getFact();
		System.out.println("Factorial: ");
		System.out.println(f);

	}

}
