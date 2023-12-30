package BackJoon.BruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class B2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int max = 0;
		int[] result = new int[7];
		int index=0;
		int index2=0;
		for(int i=0; i<arr.length;i++) {
			Arrays.sort(arr);
			max+=arr[i];
		}
		for(int i=0;i<arr.length-1;i++) {
			for(int j =i+1 ; j<arr.length;j++) {
				int temp = arr[i]+arr[j];
				if(max-temp==100) {
					index=i;
					index2=j;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(i!=index && i!=index2) {
				System.out.println(arr[i]);
			}
		}
	}

}
