import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1748 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		//�Է°��� �ڸ���
		int size = String.valueOf(N).length();
		//10�� ������ Math.pow�� ���
		int up = (int) (((N - Math.pow(10, (size - 1))) + 1) * size);
		int down = 0;
		for(int i = 0; i < size - 1; i++) {
			down += (9 * Math.pow(10, i)) * (i + 1);
		}
		System.out.println(up + down);
	}

}
