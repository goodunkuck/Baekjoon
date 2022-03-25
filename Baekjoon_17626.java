import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_17626 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n + 1];
		
		dp[0] = 0;
		dp[1] = 1;
		for(int i = 2; i <= n; i++) {
			//���� ���� ���� ������ �� ���� +1�̴� �� ���� �״�� �켱 �����´�.
			dp[i] = dp[i - 1];
			for(int j = 1; j * j <= i; j++) {
				//���� ���ִ� ����, i - j * j�� ���� ���ؼ� ���� ���� �ٽ� ����
				dp[i] = Math.min(dp[i], dp[i - (j * j)]);
			}
			//�ּڰ��� ����Ǿ����״� +1�� �ؼ� ������ ���ش�.
			dp[i]++;
		}
		System.out.println(dp[n]);
	}

}
