import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_3004 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		
		//���� for������ i�� 0���� ���������� ���⼱ �� �� ���������� ����
		//�����ϱ� ���ϰ� 1���� �����Ѵ�(1���� �ϹǷν� i�� �ڸ������� �ڸ��� ��ȣ�� �ȴ�)
		for(int i = 1; i <= N; i++) {
			//ù��° �ڸ����� 2�� ������ 1�� ���ϸ� 1�� �Ǿ������ ������ if������ �������ش�.
			if(i == 1) {
				sum += 2;
			}else {
				sum += ((i / 2) + 1);
			}
		}
		System.out.println(sum);
	}

}
