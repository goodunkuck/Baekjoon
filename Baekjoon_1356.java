import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1356 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int count = 0;
		int i = 1;
		
		//���� ����
		while(true) {
			//front�� �ڸ����� ������ �պκ��� ���갪, back�� �޺κ��� ���갪�� ������ ����
			int front = 1;
			int back = 1;
			
			if(N.length() == 1) break;
			
			//�ڸ��� ���� char�����̱� ������ - '0'�� ���ش�.
			for(int j = 0; j < i; j++) {
				front *= N.charAt(j) - '0';
			}
			
			for(int j = i; j < N.length(); j++) {
				back *= N.charAt(j) - '0';
			}
			
			if(front == back) {
				count = 1;
				break;
			}
			
			if(i == (N.length() - 1)) break;
			
			i++;
			
		}
		//���׿����� ���
		String result = (count == 1) ? "YES" : "NO";
		
		System.out.println(result);
	}

}