import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_5692 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//������� ������ StringBuilder
		StringBuilder sb = new StringBuilder();
		
		//���ѷ���
		while(true) {
			String S = br.readLine();
			//S�� ����
			int size = S.length();
			int sum = 0;
			
			//0�Է½� ����
			if(S.equals("0")) break;
			
			//���ڿ� 0�ε������� �������ε������� �ݺ��ϴ� �ݺ���
			for(int i = 0; i < S.length(); i++) {
				int n = S.charAt(i) - '0';
				//���� 1�� �����ִ� �ǹ̰� ���⶧���� 2���� ����
				//������ S.length()�� �ƴ� size�� ������ ������ �ڸ�����
				//�Ѿ ���� ������ �ִ񰪵� �پ�����ϱ� �����̴�.
				for(int j = 2; j <= size; j++) {
					n *= j;
				}
				sum += n;
				size--;
			}
			//���⼭ ����ص� ������ Ǯ �� ������ �ð��� ���� �ɸ���.
			//System.out.println(sum);
			
			//�׷��� StringBuilder�� ����Ѵ�.
			sb.append(sum).append("\n");
		}
		//�������� ������� ����Ѵ�.
		System.out.println(sb);
	}

}
