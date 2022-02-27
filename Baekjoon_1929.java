import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1929 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		//�Ҽ� �Ǻ� �迭 N���� ��Ÿ�������� ������ N+1��
		//�Ҽ� �Ǻ��� �� boolean ���� ������� �ʰ� int���̳� String�� ���� �ٸ� �ڷ����� ����ص� �ȴ�.
		boolean[] arr = new boolean[N + 1];
		StringBuilder sb = new StringBuilder();
		
		//0�� 1�� �Ҽ��� �ƴϴ�.
		arr[0] = true;
		arr[1] = true;
		
		//�������� ���� �����ؼ� N�� ���� ������������ �Ҽ��� ����� ������ �ָ� �ȴ�.
		for(int i = 2; i * i <= N; i++) {
			//�Ҽ��϶�
			if(!arr[i]) {
				//j���� �Ҽ��� ������� ���;��ϱ⶧���� �Ʒ� ������ ����.
				for(int j = i * i; j <= N; j += i) {
					//�Ҽ��� ����鿡�� true�� ����
					arr[j] = true;
				}
			}
		}
		
		for(int i = M; i <= N; i++) {
			if(!arr[i]) sb.append(i).append("\n");
		}
		System.out.println(sb);
	}

}
