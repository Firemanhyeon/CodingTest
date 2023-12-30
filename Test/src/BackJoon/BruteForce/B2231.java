package BackJoon.BruteForce;

import java.util.Scanner;

public class B2231 {

	public static void main(String[] args) {
		//브루트포스 완전탐색
		//입력받은 값만큼 0부터 반복문 실행하면서 원하는 값이 작은 수이기 때문에 나왔을때 break로 빠져나오게끔 설계
		//숫자의 자리수를 파악하는 방법을 몰랐음.
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean check = true;
		for(int i=0;i<N;i++) {
			int num = i;
			int sum=0;
			while(num!=0) {
				sum+=num%10;
				num /=10;
			}
			if(sum+i==N) {
				System.out.print(i);
				check=false;
				break;
			}
		}
		if(check) {
			System.out.println(0);
		}
	}

}
