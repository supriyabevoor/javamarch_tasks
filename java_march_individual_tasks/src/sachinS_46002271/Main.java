package sachinS_46002271;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println( "Enter an integer: " );
		int num = scan.nextInt();
		scan.close();
		int result = UserMainCode.getUnique(num);
		if (result == 1) {
			System.out.println("Unique");
		}
		else {
			System.out.println("Not Unique");
		}
	}

}

class UserMainCode {
	public static int getUnique (int num) {		
		int[] digits=new int[10]; // creating array of size 10 with indexing from 0 - 9
		int flag=0;				  // flag to check duplicity of digits
		while (num > 0) {
			int a = num % 10;
			num = num/10;
			if (digits[a] == 0) {
				digits[a]++;
			}
			else {
				flag++;
				break;
			}
		}
		if (flag == 0) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
