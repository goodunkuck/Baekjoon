import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_2752 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//숫자가 3개로 제한되었기 떄문에 배열의 크기도 3으로 정한다.
		int[] arr = new int[3];
		
		//반복문을 통해 배열에 순서대롤 입력 값을 넣어준다.
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		//Arrays 클래스에 있는 sort로 정렬해준다.
		Arrays.sort(arr);
		//배열을 출력하게 되면 다른 기호도 출력되기 때문에 하나씪 꺼내 출력한다.
		for(int i = 0; i < 3; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
