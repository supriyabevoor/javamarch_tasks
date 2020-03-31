package supriyaB_115542;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		
		System.out.println(UserMainCode.validateNumber(s1));
		in.close();
		
	}

}
class UserMainCode{
	
	public static String validateNumber(String s1) {
		
		if(s1.matches("^-[0-9]*"))
			return s1.substring(1);
		
		return "-1";
		
	}
}