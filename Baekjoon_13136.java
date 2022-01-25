import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_13136 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double R = Double.parseDouble(st.nextToken());
		double C = Double.parseDouble(st.nextToken());
		double N = Double.parseDouble(st.nextToken());
		
		//Ǯ�̹���� ���� ��ó�� int�δ� �ȵǱ� ������ long ���
		//���ο� ���� ���� ���ؼ� �ݿø�
		long RCCTV = (long) Math.ceil(R / N);
		long CCCTV = (long) Math.ceil(C / N);
		
		//����
		long CCTV = RCCTV * CCCTV;
		
		System.out.println(CCTV);
	}

}
