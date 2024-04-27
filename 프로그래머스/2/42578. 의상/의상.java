import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap <String, Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            if(map.containsKey(clothes[i][1]))
                map.put(clothes[i][1], map.get(clothes[i][1])+1);
            else 
                map.put(clothes[i][1], 1);
        }
        
        List <Integer> value = new ArrayList<>(map.values());
        for(int i=0; i<value.size(); i++)
            answer *= value.get(i)+1;
        return answer-1;
    }
}