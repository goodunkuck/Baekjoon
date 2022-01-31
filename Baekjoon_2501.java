import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2501 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		//����� ������ ������ ���� ����
		int count = 0;
		//K��° ����� ������ ���� ����
		int result = 0;
		
		// ��� ���ϴ� �ݺ���
		for(int i = 1; i <= N; i++) {
			//����� �ϳ� ���Ë����� count�� +1
			if(N % i == 0) {
				count++;
			}
			//count�� K�� �������� �� �� ����� K��° ����� ���̱⿡ result�� ���� �� �ݺ��� ����
			if(count == K) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}

}
