import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_9020 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			//소수 판별 배열
			boolean[] arr = new boolean[n + 1];
			//0과 1은 소수가 아니다
			//true는 소수가 아니다, false는 소수다.
			arr[0] = arr[1] = true;
			
			//소수판별을 위한 에라토스테네스 체 방식
			for(int j = 2; j * j <= n; j++) {
				if(!arr[j]) {
					for(int k = j * j; k <= n; k += j) {
						arr[k] = true;
					}
				}
			}
			
			//합해서 n이 되는 두 소수를 저장 할 변수
			int prime1 = 0;
			int prime2 = 0;
			
			for(int j = 2; j <= n / 2; j++) {
				//합해서 n이 나오는 두 값이 다 소수일때 변수에 저장.
				//반복문이 끌날때까지 저장하고, 마지막에 저장 된 값이 차가 제일 작은 값이 된다.
				if(!arr[j] && !arr[n - j]) {
					prime1 = j;
					prime2 = n - j;
				}
			}
			System.out.println(prime1 + " " + prime2);
		}
	}

}
