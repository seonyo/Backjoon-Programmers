import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] stagesCnt = new int[N];
        Map<Integer, Double> fail = new HashMap<>();  // key가 index, value가 실패율
        int user = stages.length;
        
        for(int i=0; i<stages.length; i++){
            if(stages[i] <= N)
                stagesCnt[stages[i]-1]++;
        }
        
        for(int i=0; i<stagesCnt.length; i++){
            if(user == 0)
                fail.put(i+1, 0.0);
            else 
                fail.put(i+1, (double)stagesCnt[i]*100/user);
            user-=stagesCnt[i];
        }
        
        List<Map.Entry<Integer,Double>> keySet = new ArrayList<>(fail.entrySet());
        keySet.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
                
        for(int i=0; i<keySet.size(); i++){
            answer[i] = keySet.get(i).getKey();
        }
        
        return answer;
    }
}