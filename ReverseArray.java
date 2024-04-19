package Arrays;
import java.util.Arrays;
public class ReverseArray {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= new int[a.length];
		System.out.println(Arrays.toString(a));
		for (int i = a.length-1,m=0; i >=0 ; i--) {
			b[m]=a[i];
			m++;
		}
		System.out.println(Arrays.toString(b));
	}

}
