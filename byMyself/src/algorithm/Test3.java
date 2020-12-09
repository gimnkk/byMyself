package algorithm;

public class Test3 {
	public static void main(String[] args) {
		long beforeTime = System.currentTimeMillis();

		int[] estimates = new int[200000];
//		int[] estimates = {5, 1, 9, 8, 10, 5}; // 6 leng==8 3번 index arr.length-days+1 5 6 7
		int k = 100000;
		int answer = 0;

		for (int i = 0; i < (estimates.length - k + 1)/2; i++) {
			int sum = 0; // 앞쪽 배열의 합을 저장할 변수
			int sum2 = 0; // 뒤쪽 배열의 합을 저장할 변수
			for (int j = 0; j < k; j++) {
				sum += estimates[i + j];
				sum2 += estimates[estimates.length -k -(i-j)];
			}
			if (sum > answer) // 합이 최댓값보다 크면
				answer = sum; // 합을 최댓값에 저장
			if (sum2 > answer)
				answer = sum2;
		}

		System.out.println(answer);

		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long secDiffTime = (afterTime - beforeTime); // 두 시간에 차 계산
		System.out.println("Test3 시간차이(m) : " + secDiffTime / 1000d);
	}
}
