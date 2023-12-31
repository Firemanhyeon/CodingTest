package BackJoon.DFS;

import java.util.Scanner;

public class B1260Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt()+1;
		int M = sc.nextInt();
		int V = sc.nextInt();
		
		int[][] arr = new int[N][N];
		int[][] visited = new int[N][N];
		for(int i=0; i<M; i++) {
			int fr = sc.nextInt();
			int to = sc.nextInt();
			
			arr[fr][to] = 1;
			arr[to][fr] = 1;
			
		}
		DFS(arr , visited , V , N);
	}

	public static void DFS(int[][] arr, int[][] visited, int v , int N) {
		System.out.printf("%d " , v);
		for(int i=0; i<N; i++) {
			visited[i][v] = 1;
		}
		for(int i=0; i<N; i++) {
			if(arr[v][i]==1 && visited[v][i]==0) {
				DFS(arr , visited , i , N);
			}
		}
	}

}
