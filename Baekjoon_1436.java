import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1436 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int first = 666;
		while(true) {
			String S = String.valueOf(first);
			
			for(int i = 0; i < S.length() - 2; i++) {
				//6�� ������ �ε��������� �ڷ� 2�� �� 6�� �´ٸ� N�� -1�ϰ� �ݺ��� ����
				if(S.charAt(i) == '6' && S.charAt(i + 1) == '6' && S.charAt(i + 2) == '6') {
					N--;
					break;
				}
			}
			
			if(N == 0) break;
			first++;
		}
		System.out.println(first);
	}

}
