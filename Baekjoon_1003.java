import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1003 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			//���۰��� 0�� 1
			int num1 = 0;
			int num2 = 1;
			
			for(int j = 0; j < N; j++) {
				//���� j��° ���� ���ϴ� ���ε�, j�� ¦�� ���η� ���ʷ� ����Ѵ�.
				if(j % 2 == 0) {
					num2 += num1;
				}else {
					num1 += num2;
				}
			}
			
			//0��° ���� 1�� 0�� �;��ϱ� ������ ���ǹ����� �з��ؼ� ������ش�.
			//�� ���� ���� ¦�� ���ο� ���� ������ �ٸ����ؼ� ���
			if(N == 0) System.out.println(1 + " " + 0);
			else if(N % 2 == 0) System.out.println(num2 + " " + num1);
			else System.out.println(num1 + " " + num2);
		}
	}

}
