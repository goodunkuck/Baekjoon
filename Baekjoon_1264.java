import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1264 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//���ѷ���
		while(true) {
			//�Է¹��� ���� �빮�ڷ� �ٲ� ����.
			String S = br.readLine().toUpperCase();

			//# �Է½� ���ѷ��� ����
			if(S.equals("#")) break;
			
			//5������ ������ ������ result�� ����.(���ٷ� �ϸ� ������� ���ٿ� �ϳ��� ������)
			String result = S.replace("A", "")
					.replace("E", "")
					.replace("I", "")
					.replace("O", "")
					.replace("U", "");
			
			//�� ���ڿ� ������ ���� ���
			System.out.println(S.length() - result.length());
		}
	}

}
