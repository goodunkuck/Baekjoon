import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2721 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int sum = 0;
			int n = Integer.parseInt(br.readLine());
			for(int j = 1; j <= n; j++) {
				int A = 0;
				
				//T(K+1)�� �ݺ����� ���� ���ϰ�, A�� ����
				for(int k = 1; k <= (j + 1); k++) {
					A += k;
				}
				//W(n)�� ���ϴ� ��
				sum += (j * A);
			}
			System.out.println(sum);
		}
		
	}

}
