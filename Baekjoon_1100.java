import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1100 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�Ͼ�ĭ ���� ���� ���� ���� �� ����
		int result = 0;
		
		for(int i = 0; i < 8; i++) {
			String S = br.readLine();
			
			for(int j = 0; j < 8; j++) {
				//¦�� ¦�� �϶� ���� ���� result +1
				if(i % 2 == 0) {
					if(j % 2 == 0) {
						if(S.charAt(j) == 'F') result++;
					}
				//Ȧ�� Ȧ�� �϶� ���� ���� result +1
				}else {
					if(j % 2 != 0) {
						if(S.charAt(j) == 'F') result++;
					}
				}
			}
		}
		System.out.println(result);
	}

}
