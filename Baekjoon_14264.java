import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_14264 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�Ҽ� ���� ���;��ϹǷ� �Ǽ��� ���
		double N = Integer.parseInt(br.readLine());
		
		//��Ʈ�� Maht.sqrt ������ Math.pow ���
		double area = (Math.sqrt(3) / 4) * Math.pow(N, 2);
		
		System.out.println(area);
	}

}
