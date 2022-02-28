import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2231 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int num = N;
		int result = 0;
		
		while(true) {
			num--;
			String S = String.valueOf(num);
			int sum = num;
			
			for(int i = 0; i < S.length(); i++) {
				//�ڸ����� �����ַ��� int������ �ٲ���ϴµ� 
				//char������ ������ �� ���� �ƽ�Ű�ڵ� ���� ���⿡ - '0'�� ������Ѵ�.
				sum += (S.charAt(i) - '0');
			}
			if(sum == N) result = num;
			if(num <= (N / 2)) break;
		}
		
		if(result >= (N / 2)) System.out.println(result);
		else System.out.println(0);
	}

}
