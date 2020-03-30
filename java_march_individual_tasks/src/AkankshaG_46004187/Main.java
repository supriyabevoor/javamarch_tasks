package AkankshaG_46004187;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter Password");
		String s = scan.nextLine();
		scan.close();
		int result=UserMainCode.validatePassword(s);
		if(result==1){
			System.out.println("Valid Password");
		}
		if(result==-1){
			System.out.println("Invalid Password");
		}

	}

}

class UserMainCode{
	public static int validatePassword(String password){
		
		int spChCount=0;
		int numCount=0;
		for(int i=0; i<password.length();i++){
			char ch=password.charAt(i);
			if(is_Numeric(ch)){
				numCount++;
			}
			if(is_spCh(ch)){
				spChCount++;
			}
		}
		if(password.length()>=6&&password.length()<=20&&numCount>=1 && spChCount>=1 ){
			return 1;
		}
		else{
			return -1;
		}
	}
	public static boolean is_Numeric(char ch){
		return(ch>='0'&& ch<='9');
	}
	public static boolean is_spCh(char ch){
		return(ch=='@' || ch=='$'||ch=='#');
	}
}