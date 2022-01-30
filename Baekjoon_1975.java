import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1975 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		//0�� ������ �� ������ ���� T��ŭ �ݺ�
		for(int i = 0; i < T; i++) {
			//0�� ������ ������ ����
			int count = 0;
			int N = Integer.parseInt(br.readLine());
			//N�� �������� ����ϴ� �ű⿡ N������ �ݺ�
			for(int j = 2; j <= N; j++) {
				//���ص� ������� ������ N���� ����
				int val = N;
				//�ش� ������ ���ڸ��� �ݺ� Ƚ���� �޶����� ������ ���� ����
				while(true) {
					//val�� j�� ������ �������� 0�� �ƴϸ� ���ѷ��� ����
					if(val % j != 0) {
						break;
					}
					count++;
					val /= j;
				}
			}
			System.out.println(count);
		}
	}
}
