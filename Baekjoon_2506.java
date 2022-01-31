import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2506 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//�� �տ� ������ ���� ������ ���� ����
		int val = 0;
		//�� ���� ������ ���� ����
		int sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int M = Integer.parseInt(st.nextToken());
			
			//�Է°��� 0�̸� val�� 0���� �ʱ�ȭ, 0�� �ƴ� ��� 1�� �����ش�.
			if(M == 0) {
				val = 0;
			}else {
				val += 1;
			}
			sum += val;
		}
		System.out.println(sum);
	}

}
