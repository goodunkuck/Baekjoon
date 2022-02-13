import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1173 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		//�ּ� �ƹ� ��
		int mix = m;
		//�ݺ� �� ������ ����
		int count = 0;
		
		//��� �ѹ��� ���� ��� -1 ���
		if((M - m) < T) {
			System.out.println(-1);
		}else {
			//���ѷ���
			while(true) {
				
				if((m + T) <= M) {
					m += T;
					N--;
				}else {
					m -= R;
				}
				
				//�������� ���� �ּ� �ƹں��� ������ �ּ� �ƹ� ����
				if(m < mix) {
					m = mix;
				}
				
				count++;
				
				//�־��� � Ƚ���� �� �ϸ� ���ѷ��� ����
				if(N == 0) break;
			}
			System.out.println(count);
		}
	}

}
