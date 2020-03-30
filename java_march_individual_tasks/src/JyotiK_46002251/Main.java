package JyotiK_46002251;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		    int[] a=new int[m];
		    int[] b=new int[n];
		    
		    for(int i=0;i<m;i++)
		    	a[i]=sc.nextInt();
		    for(int i=0;i<n;i++)
		    	b[i]=sc.nextInt();
		    sc.close();
		    int result= UserMainCode.getSumOfIntersection(a, b);
		    if(result==-1)
		    	System.out.println("No common elements");
		    else
		    	System.out.println(result);
		    
		    
		    

	}

}
class UserMainCode{
	public static int getSumOfIntersection(int a[],int b[]) {
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
					sum=sum+a[i];
			}
		}
		if(sum==0)
			return -1;
		else
			return sum;
	}
}

