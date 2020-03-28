package jayalakshmiE_114569;

import java.util.Scanner;
class UserMainCode
{
public static String encrypt(String s) 
{
	StringBuffer str=new StringBuffer();
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(i%2==1)
		{
			str.append(c);
		}
		else 
		{
			if(c=='z')
			{
				c='a';
			}else
			{
			c=(char) (c+1);
			}
			str.append(c);
		}
	}
	return str.toString();
}
}
public class Main {
	public static void main(String[] args) {
		String res=null;
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		res=UserMainCode.encrypt(s);
		System.out.println(res);
    }
}

