import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_7770 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//���� ����� ������ 1���� �߰��� ����� ���� 1���̱� ������ A B �Ѵ� 1�� ����
		int A = 1;
		int B = 1;
		
		//�� -1�� ���� ���� �� ����.
		//���� ���ѷ������� i�� +1�� ���� ���ָ� 0���� �����ؾ������� ���ڴ� �������� +1�� ���ֱ⶧���� 1�� ����.
		int i = 1;
		
		//���� ����
		while(true) {
			B += 4 * i;
			A += B;
			if(A > n) {
				break;
			}
			i++;
		}
		System.out.println(i);
	}

}
