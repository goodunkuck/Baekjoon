import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10872 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//연산값을 저장 할 변수. 곱하기를 해주기위해 1로 저장.
		int result = 1;
		
		//팩토리얼 연산 할 반복문
		for(int i = 0; i < N; i++) {
			result *= (N - i);
		}
		System.out.println(result);
	}

}
