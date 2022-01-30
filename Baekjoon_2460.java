import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2460 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�ִ� �� ����
		int max = 0;
		//���� �ο� �� ����
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			sum = sum - N + M;
			//���� �ο����� ���� ���� ������ �ִ밪���� ����
			if(max < sum) {
				max = sum;
			}
		}
		System.out.println(max);
		
	}

}