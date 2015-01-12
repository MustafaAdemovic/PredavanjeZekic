package P0506012015;

import java.util.Scanner;

/**
 * Computer imagine number from 1 to 100, we guessing that number, if it is
 * bigger than our number program show us a message
 * "Random number is bigger than your number!", if it is a smaller than our
 * number program show us a message "Random number is smaller than your number!"
 * and ask from us that we enter new number, and we enter new number until we
 * hit the imaginary number and when we hit the number program show us a message
 * " Congratulations you guessed the number! " and show what number it is!
 * 
 * @author mustafaademovic
 */

public class GuessNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number1 = (int) (Math.random() * 100 * 1);// Random number from 1
														// to 100
		System.out.print("Enter your number: ");
		int number2 = input.nextInt();

		if (number2 < 0 && number2 > 100) {

			System.out.println("Number must be in interval from 0 to 10000!!");// If
																				// number
																				// is
																				// not
																				// in
																				// this
																				// interval
																				// print
																				// message
		}

		while (number1 != number2) {

			System.out.println(" Number is wrong! ");

			if (number1 < number2)
				System.out
						.println("Random number is smaller than your number!");

			if (number1 > number2)
				System.out.println("Random number is bigger than your number!");

			number2 = input.nextInt();

		}

		System.out
				.println("\n\nCongratulations you guessed the number!\nThe number is: "
						+ number1);

	}

}
