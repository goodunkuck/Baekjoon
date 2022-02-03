import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_3460 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			//������ ������ ���� count ����
			int count = 0;
			int N = Integer.parseInt(br.readLine());
			while(true) {
				//��� ������ N�� 1�̵ȴٸ� 1�� 2�����̴� count�� ����ϰ� �ݺ��� ����
				if(N == 1) {
					System.out.println(count);
					break;
				}
				//2������ 1�� �ô븶�� count ���
				if(N % 2 == 1) {
					System.out.print(count + " ");
				}
				count++;
				N /= 2;
			}
		}
	}

}
