package PriyankaM_115501;

import java.util.Scanner;

import java.util.StringTokenizer;


public class Main {

    public static void main(String[]args) {
		
		Scanner sc =new Scanner(System.in);
	
		
		System.out.println("Enter IP: ");
			System.out.println(UserMainCode.ipValidator(sc.next()));
	}
}


class UserMainCode {
	
static int ipValidator(String ip) {
	
	int flag=2;
	
	StringTokenizer tokenizedIp=new StringTokenizer(ip,".");
	
	while(tokenizedIp.hasMoreTokens()) {
		
		int x=Integer.parseInt(tokenizedIp.nextToken());
		
		if( x>=0 && x<=255 ) {
			
			flag= 1;
		}
		else {
			
			return flag= 2;
		}
	}

	return flag;
}
	
	
}
