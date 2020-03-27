package SaurabhB_46001788;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		sc.close();
		
		int reverseNumber = UserMainCode.reverseNumber(number);
		
		System.out.println(reverseNumber);
		
	}

}

class UserMainCode {
	
	static int reverseNumber(int number) {
		
		int reverseNumber = 0;
		int temp;
		
		while (number > 0) {
			
			temp = number % 10;
			reverseNumber = reverseNumber*10 + temp;
			number = number/10;
		}
		
		return reverseNumber;
	}
}