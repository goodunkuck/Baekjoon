import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2292 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int a = 1;
		int b = 0;
		int count = 1;
		
		//1�� �ԷµǸ� 1�� ��µǾ� �ϱ� ������ �ݺ����� ����Ǹ� �ȵȴ�.
		while(N != 1) {
			//�������ڸ� 1, 7, 19, 27, ... �̴�. ������ ����ȭ����.
			a += (b * 6);
			//�����ȿ� ������ �ݺ��� ����
			if(N <= a) break;
			
			count++;
			b++;
		}
		System.out.println(count);
	}

}
