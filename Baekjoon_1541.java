import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		//���ڸ� ���� �� ����
		String num = "";
		//������� ���� �� ����
		int result = 0;
		//-�� ������ ������ �ľ��ϱ� ���� ����
		boolean minus = false;
		
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) != '-' && S.charAt(i) != '+') {
				num += S.charAt(i);
			}
			//���� ������ -�Ǵ� +�� ���� ������, �Ǵ� ������ ������ �Է� �Ǿ��� ���̴�.
			if(S.charAt(i) == '-' || S.charAt(i) == '+' || i == S.length() - 1) {
				//minus�� false�� ���ϱ�, true�� ���⸦ ���ش�.
				if(!minus) {
					result += Integer.parseInt(num);
				}else {
					result -= Integer.parseInt(num);
				}
				//num�� ������������ �ʱ�ȭ
				num = "";
			}
			//-�� �����ϸ� minus�� true�� ����.
			if(S.charAt(i) == '-') {
				minus = true;
			}
		}
		System.out.println(result);
	}

}
