package subhadeepta_115571_task37;
import java.util.Scanner;
public class Subha_main {
	

	
		static int fd(int n, int d) 
		{ 

			int c = 0; 

			while (n > 0) 
			{ 
				if (n % 10 == d) 
					c++; 
				n = n / 10; 
			} 
			return c; 
		} 
		public static void main(String args[]) 
		{ 
				int N;
				Scanner sc = new Scanner(System.in);
		        System.out.println("Enter A Number: ");
		        N = sc.nextInt();
		        
				int D = 7; 
				System.out.println("Occurance Of 7 : "+ fd(N, D));
				}
			} 
		



