import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1049 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		//��Ʈ, ���� �ּڰ��� ���� �� �����̴�. �� �� �ִ� �ִ��� �켱 ����������ϴµ�
		//���ǿ��� ���� �ִ��� 1000�̱⶧���� 1000 ����.
		int set = 1000;
		int single = 1000;
		
		//�Է°��� �����鼭 �ּڰ��� ������ ����
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			set = Math.min(set, Integer.parseInt(st.nextToken()));
			single = Math.min(single, Integer.parseInt(st.nextToken()));
		}
		
		//������ ���� 3���� ����� ���� �� 3���� ����
		int A, B, C;
		
		//������ ��Ÿ���� ������ 6�� ����̸� ���� �����ָ� ������,
		//6�� ����� �ƴϸ� �� +1�� �ؼ� �����ش�.(��Ʈ�θ� ��� ��쿡�� �ش�)
		if(N % 6 == 0) {
			A = set * (N / 6);
		}else {
			A = set * ((N / 6) + 1);
		}
		B = (set * (N / 6)) + (single * (N % 6));
		C = single * N;
		
		//�������� ���� �ּڰ��� ����
		int result = Math.min(A, Math.min(B, C));
		
		System.out.println(result);
	}

}
