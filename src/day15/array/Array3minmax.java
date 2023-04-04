package day15.array;

public class Array3minmax {

	static void min(int arr[]) {// int arr[]=a={ 33, 13, 4, 50,15,1 };
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {// 33>13 | 13 >4 | 4>50 | 4>15 | 4>1
				min = arr[i]; // min=13 | min=4 | min=4 | min=4| min=1
			}
		}
		System.out.println("Min number in array is: " + min);
	}

	static void max(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {//
				max = arr[i];
			}
		}
		System.out.println("Max number in array is: " + max);
	}

}

class Array4 {
	 public static void main(String[] args)
 {
		int a[] = { 33, 13, 4, 50, 15, 1 };// declaring and initializing an array
		Array3minmax.min(a);// passing array to method
		Array3minmax.max(a);// passing array to method
	}
}
