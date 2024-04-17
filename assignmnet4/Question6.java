//.Create an integer array of size n and read the elements from the user .Add an exception handling block to print 
//the value at nth position of the array

package assignmnet4;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		String[] str = new String[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		System.out.println("Enter the string");
		try {
			for (int i = 0; i < n; i++) {
				str[i] = sc.next();
			}
			System.out.println("Nth position element " + str[n + 1]);

		} catch (Exception e) {
			System.out.println("error");
		}
	}

}
