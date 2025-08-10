package Assignments_training;
import java.util.Scanner;
public class Avg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum = 0;
		for(int i=0;i<n;i++) {
			if(arr[i] < 10) {
				arr[i]=arr[i]*2;
			}
		}
		for(int i=0;i<n;i++) {
			sum = sum + arr[i];
		}
		int avg = sum/arr.length;
		System.out.println(avg);

	}

}
