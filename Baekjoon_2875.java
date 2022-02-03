import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2875 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int team = 0;
		//�ִ� ���� ���ϴ� �ݺ���
		while(true) {
			N -= 2;
			M -= 1;
			team++;
			if(N < 2 || M == 0) {
				break;
			}
		}
		
		//���� ¥�� ���� �ο� ���� ���Ͻ� ���� ��� ������ ������
		if(N + M < K) {
			if(K > 2) {
				K -= (N + M);
				//�� �ο� ���� 3���̴�. �׷��� ���Ͻ��� 3�� �������� �ڸ���.
				if(K % 3 != 0) {
					team -= ((K / 3) + 1);
				}else {
					team -= (K / 3);
				}
			}else {
				team -= 1;
			}
		}
		System.out.println(team);
	}

}
