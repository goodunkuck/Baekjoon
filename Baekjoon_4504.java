import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_4504 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		//�׽�Ʈ ���̽��� ���� ������ ���� �ʱ� ������ ���ѷ���
		while(true) {
			int N = Integer.parseInt(br.readLine());
			//0�� �ԷµǸ� ���ѷ��� ����
			if(N == 0) break;
			
			//���׿����ڷ� ������� ����
			String S = (N % n == 0) ? N + " is a multiple of " + n +".": N + " is NOT a multiple of " + n + ".";
			
			System.out.println(S);
		}
	}

}
