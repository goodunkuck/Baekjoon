import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Baekjoon_1676 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		BigInteger big = new BigInteger("1");
		for(int i = 1; i <= N; i++) {
			big = big.multiply(BigInteger.valueOf(i));
		}
		//BigInteger�� ���ڿ��� ����ȯ
		String S = big.toString();
		for(int i = S.length() - 1; i > 1; i--) {
			//���ڿ��� �ڸ����� char���̱⶧���� '0'�� ���ش�.
			if(S.charAt(i) - '0' == 0) count++;
			else break;
		}
		System.out.println(count);
	}

}
