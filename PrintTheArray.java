package Arrays;
import java.util.Scanner;

public class PrintTheArray {
 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Length:");
		int [] a=new int[sc.nextInt()];
		int [] b=new int[a.length];
		for (int i = 0; i < a.length-1; i++) {
			System.out.println("Enter the element" + a[i]+"=:");
			a[i]=sc.nextInt();
			b[i]=a[i];
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("A elements in A:" +a[i]);
			System.out.println("B elements in B:" +b[i]);
		}
		
		
	}
}
