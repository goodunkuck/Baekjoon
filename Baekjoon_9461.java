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
			//�Ʒ� ������ 1�� �Է� �Ǿ����� 2�� ���� ������ �ȹޱ� ���ؼ�.
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
