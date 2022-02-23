import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1418 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i = 1; i <= N; i++) {
			int now = i;
			int max = 0;
			//���� ���� ���� i�� ��Ʈ ��(Math.sqrt)���� ������ ����
			for(int j = 2; j <= Math.sqrt(i);) {
				//����������� ���� ������ ����������� ���������� ����
				if(now % j == 0) {
					now /= j;
					max = j;
				//����������� ������ j +1
				}else {
					j++;
				}
			}
			//�ش� �ݺ����� ������ ���� ���� 1�� �ƴϸ� ���� ���� �ִ񰪿� ����
			if(now != 1) max = now;
			//�ִ��� K���� �۰ų� ������ ���ǿ� �´� ���̴�.
			if(max <= K) count++;
		}
		System.out.println(count);
	}

}
