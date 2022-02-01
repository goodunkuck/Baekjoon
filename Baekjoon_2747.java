import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2747 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//0번째수는 0이고 1번째 수는 1이기에 두 변수에 각각 수를 저장해준다.
		int A = 0;
		int B = 1;
		
		for(int i = 2; i <= N; i++) {
			//A와 B에 각 순서에 맞춰 서로의 값을 더해준다. 순서는 홀수 짝수 판단해서 정한다.
			if(i % 2 == 0) {
				A += B;
			}else {
				B += A;
			}
		}
		//N번째 수를 구하는 방법은 A와 B를 짝수 홀수 차례로 나눈것처럼 구한다.
		if(N % 2 == 0) {
			System.out.println(A);
		}else {
			System.out.println(B);
		}
	}

}
