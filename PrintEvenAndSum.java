package Arrays;
import java.util.Arrays;
public class PrintEvenAndSum {
	public static void main(String[] args) {
		
		int[]a= {1,2,3,4,5,6};
		int[]b=new int[a.length];
		
		int sum = 0;
		int count=0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				sum+=a[i];
		System.out.print(a[i]+" ");
	}
		
}
		System.out.println(sum);
	}
}
