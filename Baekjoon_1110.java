import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1110 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//�Է°��� ���߿� ���ϱ� ���� ���ο� ������ �����صд�.
		int n = N;
		//�ݺ�Ƚ���� üũ�ϱ� ���� ���� ����
		int count = 0;
		
		//�ݺ� Ƚ���� �� �� ���� ������ ���ѷ���
		while(true) {
			//���� �� N�� ����
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			//�ݺ��ɶ����� count +1
			count++;
			
			//���� ���� ó�� �Է°��� �����ص� ���� �������� ���ѷ��� ����
			if(N == n) break;
		}
		System.out.println(count);
	}

}
