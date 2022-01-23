import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1297 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//������ �ʺ� ���� �� 3���� ������ �Է��� �����̱⿡ �� 3���� ������ ������ش�.
		double D = Double.parseDouble(st.nextToken());
		double H = Double.parseDouble(st.nextToken());
		double W = Double.parseDouble(st.nextToken());
		
		//Math.pow�� ����. Math.sqrt�� ��Ʈ.
		double pow = Math.pow(D, 2) / (Math.pow(H, 2) + Math.pow(W, 2));
		double sqrt = Math.sqrt(pow);
		
		//�Ҽ����� ������ ������ ����϶� ������ int ������ ����ϸ� �ڵ����� ��������.
		//���⼭ ���ڴ� �ʺ�� ���� ���� �ٷ� ��¹����� ��� ��� ������ ���� int ������ �����
		//�������� ����ϰ� ������ ����ص� �ȴ�.
		System.out.println((int) (sqrt * H) + " " + (int) (sqrt * W));
		
	}

}
