import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_6378 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//���ѷ���
		while(true) {
			String S = br.readLine();
			
			//0�Է½� ���ѷ��� ����
			if(S.equals("0")) break;
			
			//���ѷ���
			while(true) {
				//�ڸ����� ������ ���ļ� ������ ����
				int sum = 0;
				
				//���ڿ� ���̰� 1�� �Ǹ� ���ѷ��� ����
				if(S.length() < 2) {
					break;
				}else {
					for(int i = 0; i < S.length(); i++) {
						sum += S.charAt(i) - '0';
					}
				}
				//���� ���ڿ��� ����ȯ�ؼ� ����
				S = String.valueOf(sum);
			}
			System.out.println(S);
		}
	}

}
