import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Baekjoon_1373 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		//����ȯ�� ���ָ鼭 ���� 2�� �����ָ� 10������ �ٲ��ش�.
		BigInteger N = new BigInteger(S, 2);
		
		//BigInteger.toString�� String���� ����ȯ ���ִ� ���̰�, ���� ��ȣ�ȿ� ���ϴ� ������ �����ָ� �ȴ�.
		String result = N.toString(8);
		
		System.out.println(result);
	}

}
