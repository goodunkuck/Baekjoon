import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1110 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//입력값을 나중에 비교하기 위해 새로운 변수에 저장해둔다.
		int n = N;
		//반복횟수를 체크하기 위한 변수 선언
		int count = 0;
		
		//반복 횟수를 할 수 없기 때문에 무한루프
		while(true) {
			//연산 후 N에 저장
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			//반복될때마다 count +1
			count++;
			
			//연산 값이 처음 입력값을 저장해둔 값과 같아지면 무한루프 종료
			if(N == n) break;
		}
		System.out.println(count);
	}

}
