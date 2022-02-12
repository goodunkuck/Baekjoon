import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_1076 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//���� ������� ������� String ���� �迭
		String[] color = {"black", "brown", "red", "orange", "yellow", "green",
				"blue", "violet", "grey", "white"};
		
		String A = br.readLine();
		String B = br.readLine();
		String C = br.readLine();
		
		//�ε������� �����̱� ������ ó�� ������ *10�� ���ְ� �ι�° ���� �����ش�.
		long result = (Arrays.asList(color).indexOf(A) * 10) + Arrays.asList(color).indexOf(B);
		//�ѹ��� �����ϱ⿡ �ʹ� ������� ���ٷ� ������.
		//ù��°���� �ι�°���� �ش��� ���� �������� �� ���� ����° ���� �����ش�.
		result *= Math.pow(10, Arrays.asList(color).indexOf(C));
		
		System.out.println(result);
	}

}
