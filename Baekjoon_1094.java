import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1094 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int count = 0;
		//�����
		int[] arr = {64, 32, 16, 8, 4, 2, 1};
		int sum = 0;
		
		//������ �� 7���̴� 7�� �ݺ��ϴ� �ݺ���
		for(int i = 0; i < 7; i++) {
			//���ϴ� ������ ���� ����θ� �����Ѵ�.
			if(arr[i] <= X) {
				sum += arr[i];
				count++;
			}
			//���ߴµ� ���ϴ� ������ ��� ���ش�. ���⶧���� ���������� ���ش�.
			if(sum > X) {
				sum -= arr[i];
				count--;
			}
			//�������� �ݺ����� �����ϰ� ������ ����Ѵ�.
			if(sum == X) break;
		}
		System.out.println(count);
	}

}
