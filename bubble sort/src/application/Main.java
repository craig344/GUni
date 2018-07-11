package application;

import application.bubbleSort;

public class Main {
	
	public static void main(String args[]) {
		int []arr = {10, 7, 15, 1};
	
		bubbleSort bSort = new bubbleSort();
		bSort.setArr(arr);
		System.out.println("Before: ");
		bSort.display();
		bSort.sort();
		System.out.println("\nAfter: ");
		bSort.display();
	
	}
	
}
