import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2720 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int M = Integer.parseInt(br.readLine());
			System.out.print((M / 25) + " ");
			M %= 25;
			System.out.print((M / 10) + " ");
			M %= 10;
			System.out.print((M / 5) + " ");
			M %= 5;
			System.out.print(M);
			//마지막에 println으로 다음 테스트 케이스는 줄 바꿈 후 입력됨
			System.out.println();
		}
		
	}

}
