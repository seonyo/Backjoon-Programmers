import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int cnt = 0;
        int max = Arrays.stream(citations).max().getAsInt();
        
        while(cnt <= max){
            int maxCnt = 0;
            int minCnt = 0;
            for(int i=0; i<citations.length; i++){
                if(cnt >= citations[i]) minCnt++;
                if(cnt <= citations[i]) maxCnt++;
            }
            if(maxCnt >= cnt && minCnt <= cnt)
                answer = cnt;
            cnt++;
        }
        
        return answer;
    }
}