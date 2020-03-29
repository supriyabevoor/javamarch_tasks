package thejusM_115589_task17;

public class UserMainCode {

	public static int removeElements(String[] a, int m) {
	    int x = a.length;
	    for (int i = 0; i < a.length; i++) {
	      if (a[i].length() == m)
	        x--;
	    }
	    return x;
	  }

}
