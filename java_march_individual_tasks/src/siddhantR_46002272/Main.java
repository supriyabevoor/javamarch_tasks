package siddhantR_46002272;

import java.util.Scanner;

public class Main {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		String str;
		System.out.println("Enter the String to find the count of largest chunk in it."); // console message when
																							// program starts

		for (;;) // infinite for loop until we get the valid string of length at least 1
		{
			str = scan.nextLine(); // this statement reads the user input and stores it in 'str'
			if (str.length() == 0) // if the string length is 0, so it is not a valid string, So user must be
									// prompted back to enter the string again.
				System.out.println(
						"Please re-enter the string and press enter(the String must contain at least one letter)");
			else // if the user entered string is valid, just break out of the loop and move
					// forward in the code
				break;
		}
		int result = UserMainCode.largestChunk(str); // calling largestChunk method of UserMainCode to return the count
														// of largest chunk available in the string provided by the user
														// and stores it in integer variable 'result'.
														// if no character is found appearing more than 1 time
														// consecutively, then return -1
														// or else return the count of largest chunk
		if (result == -1) // if no character is found appearing more than 1 time consecutively, then
							// return -1 AND PRINT No chunks
		{
			System.out.println("No chunks");
		} else {
			System.out.println(result);// or else return the count of largest chunk
		}

		scan.close(); // closing the Scanner object to prevent the resource leak
	} // End of Main

} // End of Class Main

class UserMainCode {
	//start of UserMainCode class
	public static int largestChunk(String str) {
		int tempCount = 0; // initializing temporary count to 0, this variable will be used the function to
							// check the count of largest chunks
		int count = 0; // initializing count to 0
		str = str.replaceAll("\\s{1,}", " "); // if the extra spaces is given by the user, then bring it back to the
												// single space. this step is much important
												// for example if user provided "hoooooow are you" then the output
												// SHOULD BE 6.
												// but it will come to 18 because of consecutive spaces.
												// To prevent this, this step is very important.

		for (int i = 0; i < str.length(); i++) // outer loop
		{
			count = 1; // increasing count to 1
			inner: for (int j = 1; i + j < str.length(); j++) { // inner loop
				if (str.charAt(i) == str.charAt(i + j)) { // If the subsequesnt letters are same then
															// increaing the count and also check next letter
					count++;
				} else { // if subsequent letters are not same then break the inner loop.
					break inner;
				}
			} // end of outer loop

			if (count > tempCount) { // if the count is more than the tempCount (which will store the count of
										// character which has largest chunk count till the string has been checked for
										// largest chunk),
				tempCount = count; // then assign the count value to tempCount to store the value of largest chunk
									// count till the string has been checked for largest chunk
			}
		} // end of inner loop
		/*
		 * After the whole checking of the loop, assign the value of tempCount(which has
		 * stored the count of character which has largest chunk count to largestChunkCount
		 * variable for code readability
		 */
		int largestChunkCount = tempCount;
		if (tempCount == 1) { // if no character is found having consecutive count more than 1, then return -1
			return -1;
		}
//		else return the count of largest
		return largestChunkCount;
	}// End of largestChunk()
} // End of Class UserMainCode
