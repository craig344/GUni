package application;


public class bubbleSort {
	public static void main(String[] args) {
		int arr[] = {10, 3, 9};
		System.out.println("Before: ");
		System.out.println(arr);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] > arr[j+1]) {
					Integer temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
