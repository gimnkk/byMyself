package algorithm;

public class Test4 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr1 = {3, 2, 4, 8, 7};	//6
		int[] arr2 = {8, 7, 6, 5, 3};	//0 최대값이 나왔을 때, break 되어야 함.
		int[] arr3 = {2, 1, 1, 1, 2};	//1
		System.out.println(sol.solution(arr1));
		System.out.println(sol.solution(arr2));
		System.out.println(sol.solution(arr3));
	}
}

class Solution {
    public int solution(int[] prices) {
        int max = prices[0];
        int buy = prices[0];
        //최대값 찾기
        for(int i = 0; i < prices.length; i++) {
            if(max < prices[i]) {
                max = prices[i];
            }
        }
        //
        for(int i = 0; i < prices.length; i++) {
        	if(buy > prices[i])
        		buy = prices[i];
        	if(max == prices[i])
        		break;
        }
        return max-buy > 0 ? max-buy : 0;
    }
}