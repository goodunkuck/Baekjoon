import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Baekjoon_8437 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger X = new BigInteger(br.readLine());
		BigInteger Y = new BigInteger(br.readLine());
		
		BigInteger add = X.add(Y);
		BigInteger divide = add.divide(BigInteger.valueOf(2));
		BigInteger result = divide.subtract(Y);
		
		System.out.println(divide);
		System.out.println(result);
	}

}
