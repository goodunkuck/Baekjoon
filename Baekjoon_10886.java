import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10886 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			int M = Integer.parseInt(br.readLine());
			
			if(M == 1) {
				count++;
			}else {
				count--;
			}
		}
		//���׿����� ���
		String result = (count > 0) ? "Junhee is cute!" : "Junhee is not cute!";
		System.out.println(result);
		
		//���׿����� ��� if�� ��� ����
//		if(count > 0) {
//			System.out.println("Junhee is cute!");
//		}else {
//			System.out.println("Junhee is not cute!");
//		}
	}

}
