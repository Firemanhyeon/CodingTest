package BackJoon.BruteForce;

import java.util.Scanner;

public class B2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [] arr = new int[N];
		
		for(int i=0; i<N ; i++) {
			arr[i] = sc.nextInt();
		}
		int result = search(arr,N,M);
		
		System.out.println(result);
	}
	
	static int search(int[] arr , int N , int M) {
		int result = 0;
		for(int i=0; i<N-2;i++) {
			for(int j=i+1;j<N-1;j++) {
				for(int k=j+1;k<N;k++) {
					int max = arr[i]+arr[j]+arr[k];
					if(M==max) {
						return max;
					}
					if(max>result && M > max) {
						result = max;
					}
				}
			}
		}
		
		return result;
		
	}
}
