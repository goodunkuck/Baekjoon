import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Baekjoon_2061 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger K = new BigInteger(st.nextToken());
		BigInteger L = new BigInteger(st.nextToken());
		//�μ����� �Ҽ��� L���� ���� ��� �ش� �Ҽ��� ������ ���� ����
		int N = 0;
		
		//L�� BigInteger���̱⶧���� int���� i�� ũ�� �񱳸� �ϱ� ���� intValue�� int������ ��ȯ
		//���� L�� int ���� ��� ���� �Է� ���� �� �ִٸ� ������ ������ ��������, 1000000�̱⿡ ����
		for(int i = 2; i < L.intValue(); i++) {
			//K�� i�� ������ �������� 0�� ������ �̶�� ������ ���
			if((K.remainder(BigInteger.valueOf(i))).compareTo(BigInteger.ZERO) == 0) {
				N = i;
				break;
			}
		}
		//���׿����ڷ� S���� N���� ���ο� ���� �� ����
		String S = (N > 0)? ("BAD " + N) : "GOOD";
		
		System.out.println(S);
	}

}
