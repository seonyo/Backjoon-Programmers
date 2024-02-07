import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        String threeBase = Integer.toString(n, 3);
        List <String> numList = Arrays.asList(threeBase.split(""));
        Collections.reverse(numList);
        answer = Integer.parseInt(String.join("", numList), 3);
        return answer;
    }
}