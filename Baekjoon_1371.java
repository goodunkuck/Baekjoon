import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1371 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//EOFó���� ���� �Է°��� ���� ���ڿ� input
		String input;
		//input�� ����� ���ڿ��� ��ġ������ ���ڿ� ����
		String S = "";
		
		//while�� ���ǹ��� �ִ� ���� EOF���� �ذ� ����̴�.
		//null���� ���� �������� �ݺ��Ѵٴ� �ݺ���
		while((input = br.readLine()) != null) {
			S += input;
		}
		
		//���ڿ��� ����� ���ĺ� ������ �ִ��� ���� �� ����
		int max = 0;
		//�ְ����� ������ ���ĺ��� ���� �� ���ڿ� ����
		String Smax = "";
		
		//�ҹ��� ���ĺ� ������ŭ �ݺ��ϴ� �ݺ����� �����.
		//i�� 97 ���� 122������ ���� �ƽ�Ű �ڵ� ������ Ȱ���ϱ� �����ε�
		//���ĺ��� �ƽ�Ű�ڵ� ���� 97���� 122�����̴�.
		for(char i = 97; i < 123; i++) {
			int count = S.length() - S.replace(String.valueOf(i), "").length();
			
			if(max == count) {
				Smax += String.valueOf(i);
			}
			
			if(max < count) {
				max = count;
				Smax = String.valueOf(i);
			}
		}
		System.out.println(Smax);
	}

}
