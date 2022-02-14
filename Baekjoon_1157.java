import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1157 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�Է°��� �빮�ڷ� �ٲ� ����
		String S = br.readLine().toUpperCase();
		//���ĺ� �ߺ� ������ �ִ��� ������ ����
		int max = 0;
		//�ߺ������� �ִ��� ���ĺ��� ���� �� ����
		String result = "";
		
		//���ѷ���(���ĺ��� ������ 26���̱⶧���� 26�� �ݺ��ϴ� �ݺ����� ���� �ȴ�.)
		while(true) {
			//���� ���ڿ��� 0 �ε��� ���� ����
			String index = String.valueOf(S.charAt(0));
			//���� ���ڿ��� ���̸� ����
			int size = S.length();
			//0�ε��� ���� ���ڿ����� ����
			S = S.replace(String.valueOf(S.charAt(0)), "");
			//������ ���� ���ڿ��� ����
			int newsize = S.length();
			
			//�� ������ ���� �ߺ�����
			//�ߺ������� �ִ񰪰� ������ result�� ���ĺ��� ���Ѵ�.
			if(max == (size - newsize)) {
				result += index;
			}
			//�ߺ������� �ִ񰪺��� ũ�� �ִ񰪿� �ߺ������� �����ϰ�, result�� ���ĺ��� ����.
			if(max < (size - newsize)) {
				max = (size - newsize);
				result = index;
			}
			//���ڿ��� ��ԵǸ� ���ѷ��� ����
			if(S.equals("")) break;
		}
		//result�� �˻b���� 1���̸� result ���.
		//�ƴϸ� ?���
		if(result.length() == 1) {
			System.out.println(result);
		}else {
			System.out.println("?");
		}
	}

}
