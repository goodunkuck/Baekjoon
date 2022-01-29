import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1703 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//�Է� ������ ������ �ʾұ� ������ ���ѷ���
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			//tree�� ������. �ʱⰪ�� 1�� ������ ������ ������ ó���� 1���� �ֱ� �����̴�.
			int tree = 1;
			
			//0�� �ԷµǸ� �ݺ��� ����
			if(N == 0) {
				break;
			}
			
			for(int i = 0; i < 2 * N; i++) {
				int M = Integer.parseInt(st.nextToken());
				//������ ������� ������ ����ġ�� ���� �ԷµǱ� ������ �ԷµǴ� ���� �´� ������ ����
				if(i % 2 == 0) {
					tree *= M;
				}else {
					tree -= M;
				}
			}
			System.out.println(tree);
		}
	}

}
