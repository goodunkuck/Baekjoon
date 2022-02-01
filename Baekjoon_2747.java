import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2747 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//0��°���� 0�̰� 1��° ���� 1�̱⿡ �� ������ ���� ���� �������ش�.
		int A = 0;
		int B = 1;
		
		for(int i = 2; i <= N; i++) {
			//A�� B�� �� ������ ���� ������ ���� �����ش�. ������ Ȧ�� ¦�� �Ǵ��ؼ� ���Ѵ�.
			if(i % 2 == 0) {
				A += B;
			}else {
				B += A;
			}
		}
		//N��° ���� ���ϴ� ����� A�� B�� ¦�� Ȧ�� ���ʷ� ������ó�� ���Ѵ�.
		if(N % 2 == 0) {
			System.out.println(A);
		}else {
			System.out.println(B);
		}
	}

}
