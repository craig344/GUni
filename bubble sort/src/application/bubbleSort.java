package application;

public class bubbleSort {
	
	public static void main(String[] args) {
		int arr[] = {10, 3, 9};
		System.out.println("Before: ");
		for(int i = 0; i < arr.length; i++) {
		      System.out.print(arr[i] + " ");
		}
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j+1]) {
					Integer temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("\nAfter: ");
		for(int i = 0; i < arr.length; i++) {
		      System.out.print(arr[i] + " ");
		}
	}
}
