import java.util.Scanner;

/**
 * Program have a row with 10 random members, and ask a user to enter number.
 * When we enter a number program checks is number a member of a row, 
 * and if the number is member of row program
 * write a message "You hit the number and his position is " and write his
 * position If tne nuber doesn't exist in a row program show message
 * "Number you entered doesn't exist in a row!"
 * 
 * @author mustafaademovic
 *
 */

public class NumberPozition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int array[] = new int[]{1, 10, 12, 32, 34, 52, 68, 72, 80, 93};

		System.out.println("Enter your number: ");
		int number2 = input.nextInt();

		boolean isFound = false;

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number2){

				System.out.print("\nYou hit the number and his position is: ["+ i + "]");
				isFound = true;
			}
			
		}
		if (isFound == false) {
			System.out.println("\n Number you entered doesn't exist in a row!");
		}

	}

}
