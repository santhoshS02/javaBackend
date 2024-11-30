package interviewquestions;

import java.util.Arrays;

public class CheckTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1st method
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int b[] = { 1, 2, 3, 4, 5, 6 };

		boolean status = Arrays.equals(a, b);
		
		if (status == true) {
			System.out.println("Both the array are equal");
		} 
		else {
			System.out.println("Both are not equal");
		}

		//******************************************************************//
		
		// 2nd method
		boolean statues = true;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					statues = false;
				}
			}
		}
		else {
			status = false;
		}

		if (statues == true) {
			System.out.println("Arrays are sara equal ");
		}

	}

}
