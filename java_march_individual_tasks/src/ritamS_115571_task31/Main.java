package ritamS_115534_task31;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String s=sc.nextLine();
		
		System.out.println("Enter Count: ");
		int n=sc.nextInt();
		
		UserMainCode umc=new UserMainCode();
		
	System.out.println(umc.getString(s,n));		
	}

}

class UserMainCode {
	
	public static String getString(String s,int n) {
		
	
		String lastN=s.substring(s.length()-n);
	
		
		String add=lastN.repeat(n);

		
		String result;
		result=s.concat(add);
		
	return result;		
	}
}