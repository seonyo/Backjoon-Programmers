import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<tangerine.length; i++){
            if(map.containsKey(tangerine[i]))
                map.put(tangerine[i], map.get(tangerine[i]) + 1);
            else
                map.put(tangerine[i], 1);
        }
        
        List <Integer> cnt = new ArrayList<>(map.values());
        Collections.sort(cnt, Collections.reverseOrder());
        
        for(int i=0; i<cnt.size(); i++){
            k -= cnt.get(i);
            answer ++ ;
            if(k <= 0)
                return answer;
        }
        
        return answer;
    }
}