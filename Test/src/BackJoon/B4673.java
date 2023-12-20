package BackJoon;


public class B4673 {

	public static void main(String[] args) {
		boolean[] arr = new boolean[10001];
		
		for(int i=0 ; i< arr.length;i++) {
			
			int a = i;
			int sum = i;
			while(a!=0) {
				
				sum=sum+(a%10);
				a=a/10;
			}
			
			if(sum<10001) {
				arr[sum] = true;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(!arr[i]) {
				System.out.println(i);
			}
		}
	}

}
