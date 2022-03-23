import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_11653 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		//������ �� i
		int i = 2;
		//N�� 1�� �ƴ϶�� �ݺ�
		while(N != 1) {
			//������ �������� ���� ���� ����ϰ�, N�� i�� �����ش�.
			if(N % i == 0) {
				System.out.println(i);
				N /= i;
			//������ �������� �ʴ´ٸ� i +1���ش�.
			}else {
				i++;
			}
		}
	}

}
