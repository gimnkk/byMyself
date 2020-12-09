package algorithm;

public class Test2 {
	public static void main(String[] args) {
		long beforeTime = System.currentTimeMillis();
		
		int[] estimates = new int[200000];// { 10,2,0,10,20,30,10,1,3,4,5,6,10, 1, 10, 1, 1, 4, 3, 10,5,6,7,5, 100,1,0,10,7,8,3,4,6,10,30,50,30,10,20,40,60,90,90, 50,1,2, 3,4,5,6,7,1,1,13,5,6,7,10, 10, 10,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}; // 6 leng==8 3번 index arr.length-days+1 5 6 7
		int k = 100000;
		int answer = 0;
		
		int i = 0;
		while (i + k <= estimates.length) { // 탐색 시, estimates배열 길이 벗어나면 중지
			int sum = 0; // 합을 저장할 변수 선언
			for (int j = 0; j + i <= k - 1 + i; j++) { // 시작인덱스부터 k의 길이만큼만 탐색
				sum += estimates[i + j];
			}
			if (sum > answer) // 합이 최댓값보다 크면
				answer = sum; // 합을 최댓값에 저장
			i++; // 시작 인덱스 증가
		}
		System.out.println(answer);
		
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
		System.out.println("Test2 시간차이(m) : "+secDiffTime/1000d);
	}
}
