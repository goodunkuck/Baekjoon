import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10419 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int d = Integer.parseInt(br.readLine());
			//�ִ�� �� �� �ִ� �� max.
			int max = 1;
			
			//�������� �����ڸ��� �����ִ°�쵵 �ִ� ������ �۰ų� ����.
			while(max + (max * max) <= d) {
				max++;
			}
			//-1�ϴ� ������ �ش� ���� ������ ���� �� �ڿ��� max���� 1���ϴ� �� ���ߴµ�.
			//�׷��ԵǸ� ������ ������ �ϳ� �Ѿ ������. �׷��⿡ -1���ش�.
			System.out.println((max - 1));
		}
	}

}
