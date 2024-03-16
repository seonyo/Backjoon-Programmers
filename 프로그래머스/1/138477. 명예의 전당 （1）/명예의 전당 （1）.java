import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int [score.length];
        List<Integer> tempScore = new ArrayList<>();
        int min = Arrays.stream(Arrays.copyOfRange(score,0,3)).min().getAsInt();
        
        if(k >= score.length) k = score.length;
        
        for(int i=0; i<k; i++){
            tempScore.add(score[i]);
            Collections.sort(tempScore);
            answer[i] = tempScore.get(0);
        }
        
        for(int i=k; i<score.length; i++){
            if(tempScore.get(0) < score[i]){
                tempScore.set(0, score[i]);
                Collections.sort(tempScore);
             }
            answer[i] = tempScore.get(0);
        }
        return answer;
    }
}