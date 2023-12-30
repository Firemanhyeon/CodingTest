package BackJoon.BruteForce;

import java.util.Scanner;

public class B7568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		int[] result = new int[N];
		
		for(int i=0;i<N;i++) {
			int num = 0;
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[i][num] = x; 
			arr[i][num+1] = y; 
			result[i] = 1;
		}
		for(int i =0; i<N;i++) {
			
			for(int j=i+1;j<N;j++) {
				boolean tall = true;
				boolean weight = true;
				if(arr[i][0]< arr[j][0]) {
					tall = false;
				}else if(arr[i][0]== arr[j][0]) {
					continue;
				}
				
				if(arr[i][1]<arr[j][1]) {
					weight = false;
				}else if(arr[i][1]==arr[j][1]) {
					continue;
				}
				
				if(!tall && !weight) {
					result[i]+=1;
				}else if(tall && weight){
					result[j]+=1;
				}
			}
			
			
		}
		for(int i=0;i<N;i++) {
			System.out.print(result[i]);
			if(i+1!=N) {
				System.out.print(" ");
			}
		}
		
	}

}
