import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10872 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//���갪�� ���� �� ����. ���ϱ⸦ ���ֱ����� 1�� ����.
		int result = 1;
		
		//���丮�� ���� �� �ݺ���
		for(int i = 0; i < N; i++) {
			result *= (N - i);
		}
		System.out.println(result);
	}

}
