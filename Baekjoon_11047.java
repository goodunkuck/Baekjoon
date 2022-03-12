import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11047 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] coin = new int[N];
		
		//������ ��ġ���� �迭�� ����
		for(int i = 0; i < N; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		//���ǿ� �������� ���� ��� �ٽ� K���� �ǵ����� �ϱ⶧���� ���� ������ �����.
		int now = K;
		int result = 0;
		//���ϴ� ��ġ�� ���� �� ���������� �ݺ�
		while(now != 0) {
			for(int i = N - 1; i >= 0; i--) {
				if(now >= coin[i]) {
					result += (now / coin[i]);
					now %= coin[i];
					if(now < coin[0] && now != 0) {
						result = 0;
						now = K;
					}
				}
			}
		}
		System.out.println(result);
	}

}
