package algorithm;

public class BudgetSolution {
	public int solution(int[] d, int budget) {
		int answer = 0;
		int sum = 0;
		for(int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		if(sum <= budget)
			return d.length;
		return answer;
	}
}
