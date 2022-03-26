import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_9461 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			int[] dp = new int[N + 1];
			dp[0] = 0;
			dp[1] = 1;
			//아래 조건은 1이 입력 되었을때 2에 대한 조건을 안받기 위해서.
			if(N > 1) {
				dp[2] = 1;
				for(int j = 3; j <= N; j++) {
					dp[j] = dp[j - 3] + dp[j - 2];
				}
			}
			System.out.println(dp[N]);
		}
	}

}
