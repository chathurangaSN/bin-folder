package exercises;

import java.util.Scanner;

public class StarPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int temp = 0;

		for (int i = 0; i < count; i++) {
			if (temp <= count / 2) {
				for (int b = count / 2; b > i; b--) {
					System.out.print(" ");
				}
				
				  for(int j = 0; j < (2*i+1); j++) {
				   System.out.print("*"); }
				 

				temp++;

			} else {
				
				for (int b = 0 ; b < temp-count/2 ; b++) {
					System.out.print(" ");
				}
				
				for (int c = 1; c < 2*(count -temp); c++) {
					System.out.print("*");
				}
				temp++;
			}
			System.out.println();
		}
		/*
		 * for(int j = 0; j < (2*i+1); j++) { System.out.print("*"); }*
		 * 
		 * } for(int b = count/2; b > i; b--) { System.out.print("*"); } /*for(int j =
		 * 0; j < (2*i+1); j++) { System.out.print("*"); }
		 */

	}

}

/*
 * for (int i = 0; i < count; i++) { for(int b = count; b > i; b--) {
 * System.out.print(" "); } for(int j = 0; j < (2*i+1); j++) {
 * System.out.print("*"); }
 * 
 * System.out.println(); }
 */
