package BackJoon;

import java.util.Scanner;

public class B1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		//100미만의 수는 무조건 등차수열이다.
		//입력받은 값이 100미만의 수 인지 100이상의 수 인지 확인하고 따로 처리를 해준다
		//100미만일 경우 입력받은 숫자 그대로 출력하면 그게 등차수열의 개수가 된다.
		//100이상일 경우 100이전의 등차수열 99로 세팅을 해주고 각 자리수의 차가 같은 경우에 result를 카운팅한다.
		
		if(N<100) {
			System.out.println(N);
		}else if(N>=100) {
			result = 99;
			for(int i=100;i<=N;i++) {
				int hun = i/100;
				int ten = (i/10)%10;
				int one = i%10;
				if((hun-ten)==(ten-one)) {
					result++;
				}
				
			}
			System.out.println(result);
		}
		
	}

}
