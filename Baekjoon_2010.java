import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2010 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//�÷��׸� ���� �ڸ� ���� �� ���� ��Ÿ���� ����. ó���� 1���̱� ������ 1����.
		int sum = 1;
		
		//�Է��� ���� sum�� �����ش�.
		for(int i = 0; i < N; i++) {
			sum += Integer.parseInt(br.readLine());
		}
		//��Ƽ���� ����� �ڸ��� �ѹ� �������� �ϳ��� ����ϱ⿡ �ݺ� Ƚ����ŭ -1���ָ� �Ǵ� N�� ���ָ� �ȴ�.
		sum -= N;
		System.out.println(sum);
	}

}
