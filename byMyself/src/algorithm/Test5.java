package algorithm;

import java.util.*;

public class Test5 {
	public static void main(String[] args) {

		Solution2 sol = new Solution2();
		String p1 = "PM 01:00:00";
		int n1 = 10;
		String p2 = "PM 11:59:59";
		int n2 = 1;

		System.out.println(sol.solution(p1, n1));
		System.out.println(sol.solution(p2, n2));
	}
}

//12시간 단위를 24시간 단위로 바꾸기

class Solution2 {
	public String solution(String p, int n) {
		String answer = "";
		Date date = new Date();
		
		return answer;
	}
}