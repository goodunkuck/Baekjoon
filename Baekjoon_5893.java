import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Stack;

public class Baekjoon_5893 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Long���� ���� �� ���� ���̱⿡ BigInteger�� ���
		BigInteger N = new BigInteger(br.readLine(), 2);
		//�������� ���� 10������ 2������ ������ stack
		Stack<BigInteger> stack = new Stack<>();
		
		//N�� 17�� ���ϰ� N�� �ٽ� �����Ѵ�.
		N = N.multiply(BigInteger.valueOf(17));
		
		//2������ �ٲٴ� ����� ���� 2�� ��� ������ �������� ���� �� 1�� �̾Ƴ��� ����̴�.
		//�̾Ƴ� �������� ���� ������� stack�� ����ִ´�.
		while(true) {
			stack.push(N.remainder(BigInteger.valueOf(2)));
			N = N.divide(BigInteger.valueOf(2));
			if(N.equals(BigInteger.ONE)) {
				stack.push(N);
				break;
			}
		}
		//! .isEmpty�� stack�� ����� �ڷᰡ ���������� �ݺ��Ѵ�.
		while(!stack.isEmpty()) {
			BigInteger S = stack.pop();
			System.out.print(S);
		}
	}

}
