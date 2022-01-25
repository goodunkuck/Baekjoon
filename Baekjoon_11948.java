import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_11948 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//4개짜리 과목과 2개짜리 과목 배열 생성
		int[] arr = new int[4];
		int[] arr2 = new int[2];
		//배열에 저장
		for(int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		//정렬
		Arrays.sort(arr);
		//최솟값 제외하고 합산
		int sum = arr[1] + arr[2] + arr[3];
		//나머지 두과목 배열에 점수 입력
		arr2[0] = Integer.parseInt(br.readLine());
		arr2[1] = Integer.parseInt(br.readLine());
		Arrays.sort(arr2);
		//큰 값을 합산
		sum += arr2[1];
		
		/*이 공식은 숫자 두개는 굳이 반복문 사용하지 않고 두수를 Math 함수로
		최대값을 구해서 최대값만 sum에 합하는 방식이다.
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		sum += Math.max(A, B);*/
		
		System.out.println(sum);
	}

}
