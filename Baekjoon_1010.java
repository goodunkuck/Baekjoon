import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1010 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long N = Long.parseLong(st.nextToken());
			long M = Long.parseLong(st.nextToken());
			//result�� ���갪�� �������� ���ε� ó���� ���ϱ⶧���� 1�� �������ش�.
			long result = 1;
			
			//���ϰ� �����⸦ �ݺ��Ҷ����� ó�����ش�.
			//������ ó�� ���� 1������ �ݺ����� j�� 0���� �����ϱ� ������ +1�� ���ش�.
			for(int j = 0; j < N; j++) {
				result *= (M - j);
				result /= (j + 1);
			}
			System.out.println(result);
		}
	}

}
