import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_4388 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//�׽�Ʈ ���̽��� ���� ������ ���ѷ���
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringBuilder sb = new StringBuilder(st.nextToken());
			String N = sb.reverse().toString();
			sb = new StringBuilder(st.nextToken());
			String M = sb.reverse().toString();
			
			//�� ������Ų ���ڿ����� ���� ����
			int Nsize = N.length();
			int Msize = M.length();
			
			//0 0�Է� �� ���ѷ��� ����
			if(N.equals("0") && M.equals("0")) {
				break;
			}
			
			//num : �ش� �ڸ������� ���� 10�̻��� ������ ���� ���� ���ϱ� ���� ����
			//count : �޾ƿø� Ƚ���� üũ�ϱ� ���� ����
			int num = 0;
			int count = 0;
			
			//�� ���ڿ��� ������ �� ���̸�ŭ �ݺ�, ª�� ������ +1��ŭ�� �ص� �ȴ�.
			for(int i = 0; i < Math.max(Nsize, Msize); i++) {
				//���ڿ��� �ڸ����� ���� ���� int������ ��ȯ���Ѽ� �����ϱ� ���� ����
				int n = 0;
				int m = 0;
				//���� ������ �ڸ����� ���� ���̰� ª�� ���ڿ��� ���̸� ���� �ʾ����� �Ѵ� ����
				if(i < Math.min(Nsize, Msize)) {
					n = N.charAt(i) - '0';
					m = M.charAt(i) - '0';
					//���� ������ �ڸ����� ���� ���̰� ª�� ���ڿ��� ���̸� �Ѿ����� ���̰� �� ���� ����
				}else {
					//���׿����ڷ� ���̰� �� ���� �ڸ����� ����. if������ �ص���.
					n = (Math.max(Nsize, Msize) == Nsize) ? N.charAt(i) - '0' : M.charAt(i) - '0';
				}
				//�� �ڸ����� ���� �ڸ����� 10�̻� ���ο� ���� num���� �������� 10�̻��̸�
				//num�� 1�����ϰ�, count�� 1�� ���Ѵ�.
				if((n + m  + num) >= 10) {
					num = 1;
					count++;
					//�� �ڸ����� num���� �������� 10�̸��̸� num�� 0 ����
				}else {
					num = 0;
				}
			}
			System.out.println(count);
		}
	}

}
