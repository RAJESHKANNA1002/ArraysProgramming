package Arrays;
import java.util.Arrays;


public class BubbleSort {

	public static void main(String[] args) {
		
		
		int a []= {1,4,2,6,3,6,9};
		
		for (int i = 0; i <a.length; i++) {
			for (int j = i+1; j < a.length-1; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
				
			}
			System.out.println(Arrays.toString(a));
		}
		
	}
}
