package weekOneDayFour;

import java.util.Arrays;

public class LearnNestedLoop {

	public static void main(String[] args) {

		int arr1[] = { 9, 3, 7, 1, 5 };
		int arr2[] = { 2, 4, 6, 8, 7 };

		Arrays.sort(arr1);

		// length starts from 5
		// index starts from 4
		for (int i = 0; i < arr1.length; i++) {

			System.out.println(arr1[i]);
		}
		///// Nested for loop

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr2[j]);
					break;

				}
			}

		}

	}

}
