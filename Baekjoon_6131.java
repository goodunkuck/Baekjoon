import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_6131 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//���� ������ ������ ����
		int count = 0;
		int A, B;
		
		for(int i = 1; i < 501; i++) {
			B = i;
			//B������ N�� ���� ���� ��Ʈ�Ѵ�. Math.sqrt
			A = (int) Math.sqrt((B * B) + N);
			
			//�� ���� ã������ count������ ���� 1 �߰�
			if((A * A) - N == B * B) {
				count++;
			}
		}
		System.out.println(count);
	}

}
