import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_9020 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			//�Ҽ� �Ǻ� �迭
			boolean[] arr = new boolean[n + 1];
			//0�� 1�� �Ҽ��� �ƴϴ�
			//true�� �Ҽ��� �ƴϴ�, false�� �Ҽ���.
			arr[0] = arr[1] = true;
			
			//�Ҽ��Ǻ��� ���� �����佺�׳׽� ü ���
			for(int j = 2; j * j <= n; j++) {
				if(!arr[j]) {
					for(int k = j * j; k <= n; k += j) {
						arr[k] = true;
					}
				}
			}
			
			//���ؼ� n�� �Ǵ� �� �Ҽ��� ���� �� ����
			int prime1 = 0;
			int prime2 = 0;
			
			for(int j = 2; j <= n / 2; j++) {
				//���ؼ� n�� ������ �� ���� �� �Ҽ��϶� ������ ����.
				//�ݺ����� ���������� �����ϰ�, �������� ���� �� ���� ���� ���� ���� ���� �ȴ�.
				if(!arr[j] && !arr[n - j]) {
					prime1 = j;
					prime2 = n - j;
				}
			}
			System.out.println(prime1 + " " + prime2);
		}
	}

}
