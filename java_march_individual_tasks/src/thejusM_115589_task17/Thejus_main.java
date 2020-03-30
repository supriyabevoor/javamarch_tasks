package thejusM_115589_task17;

import java.util.Scanner;

public class Thejus_main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter any length: ");
	    int n = sc.nextInt();
	    
	    String[] a = new String[n];
	    System.out.println("Enter Strings: ");
	    for (int i = 0; i < n; i++)
	      a[i] = sc.next();
	    
	    System.out.println("Enter length to remove:");
	    int m = sc.nextInt();
	    UserMainCode um = new UserMainCode();
	    System.out.println("Output: ");
	    System.out.println(um.removeElements(a, m));
	  }
	  

}


