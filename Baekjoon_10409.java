import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10409 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//���� ��
		int n = Integer.parseInt(st.nextToken());
		//�־��� �ð�
		int T = Integer.parseInt(st.nextToken());
		//���� ���� ��
		int i = 0;
		
		st = new StringTokenizer(br.readLine());
		for(i = 0; i < n; i++) {
			//�־��� �ð��� �Էµ� �ð��� ���ش�.
			T -= Integer.parseInt(st.nextToken());
			//�־��� �ð��� �� �������� �ݺ��� ����
			if(T < 0) {
				break;
			}
		}
		//���� ���� ���� ���
		System.out.println(i);
	}

}
