package algorithm;

public class Test6 {

	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		String[] strs = {"abcaefg", "abcdefg", "abcdhfg"};
		String[] strs2 = {"a", "b", "c"};
		System.out.println(sol.solution(strs));
		System.out.println(sol.solution(strs2));
	}

}

class Solution3 {
    public String solution(String[] strs) {
        String answer = "";
        int idx = 0;
        for (int i = 0; i < strs.length; i++) {
        	if(i == 0 && strs[i].charAt(0) != strs[i+1].charAt(0))
        		return answer;
        	else if(i != 0 && strs[i-1].charAt(0) != strs[i].charAt(0))
        		return answer;
        	else
				answer += strs[i].charAt(idx);
        		idx++;
        		if(idx > strs[i].length())
        			break;
		}
        return answer;
    }
}