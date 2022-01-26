import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_15873 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int N = 0;
		
		//�Է°��� ���̿� ���� ���� �ٸ��� ���Ѵ�.
		//���̰� 2�� ��� 0�ε��� ���� 1�ε��� ���� �����ش�.
		//-'0' �ϴ� ������ �ƽ�Ű �ڵ忡 ���� ��ȯ �Ǵ� �� �����̴�.
		if(S.length() == 2) {
			N = (S.charAt(0) - '0') + (S.charAt(1) - '0');
			//���̰� 3�� ��� ����� 0�̸� �� ���ڰ� 10 ����� 0�� �ƴϸ� �� ���ڰ� 10
			//10�� �ƴ� ���ڸ� �̾Ƴ��� 10�� �����ش�.
		}else if(S.length() == 3) {
			if(S.charAt(1) == '0') {
				N = (S.charAt(2) - '0') + 10;
			}else {
				N = (S.charAt(0) - '0') + 10;
			}
			//���̰� 4�� �� �� �� 10�� ���⶧���� 20 ���
		}else if(S.length() == 4){
			N = 20;
		}
		
		System.out.println(N);

	}

}
