package �����嵥2;

import java.util.Scanner;

public class case5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// Prompt the user for input
		System.out.print("Enter an integer for second: ");
		int seconds = input.nextInt();
		
		int minutes = seconds / 60; // find minutes in seconds
		int remainingSeconds = seconds % 60; // Seconds remaining
		System.out.println(seconds + " second is " + minutes + " minutes and " + remainingSeconds + " seconds");
		
	}

}
