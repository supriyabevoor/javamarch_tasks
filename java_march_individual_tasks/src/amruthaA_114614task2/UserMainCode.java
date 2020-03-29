package amruthaA_114614task2;
import java.util.Scanner;
 public class UserMainCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println(removeEvenVowels(s1));
	}
    
	public static String removeEvenVowels(String s1) {
		StringBuffer sb1=new StringBuffer();
		for(int i=0;i<s1.length();i++) {
			if((i%2)==0)
				sb1.append(s1.charAt(i));
			else if((i%2)!=0)
				if(s1.charAt(i)!='a' && s1.charAt(i)!='e' && s1.charAt(i)!='i' && s1.charAt(i)!='o' && s1.charAt(i)!='u')
				if(s1.charAt(i)!='A' && s1.charAt(i)!='E' && s1.charAt(i)!='I' && s1.charAt(i)!='O' && s1.charAt(i)!='U')
					sb1.append(s1.charAt(i));
		}
		
		return sb1.toString();
	}
}