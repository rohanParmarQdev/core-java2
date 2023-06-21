package Practical_19;

public class FindArrayIndex {

	public static void main(String[] args) {
		int arr[] = { 11, 27, 32, 40, 52, 65 };
		int index = -1;

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 27) {
				index = i;
				break;
			}
		}
		if(index != -1) {
		System.out.println("Index Number is : " + index);
		} else {
			System.out.println("Number is not found");
		} 
	}
}
