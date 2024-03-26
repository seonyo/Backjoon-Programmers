import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer ={1,6};
        int rightCnt = 0;
        int zeroCnt = 0;
        List<Integer> listTemp = new ArrayList<>();
        
        for(int i=0; i<win_nums.length; i++){
            listTemp.add(win_nums[i]);
        }
        
        for(int i=0; i<lottos.length; i++){
            if(listTemp.contains(lottos[i]))
                rightCnt++;
            if(lottos[i] == 0)
                zeroCnt++;
        }
        
        if(zeroCnt == 6) return answer;
        answer[0] = rightCnt == 0 ? 6 : 7 - (rightCnt + zeroCnt);
        answer[1] = rightCnt == 0 ? 6 : 7 - rightCnt;
        return answer;
    }
}