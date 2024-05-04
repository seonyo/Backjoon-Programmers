import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap <String, Integer> map1 = new HashMap<>();
        for(int i=0; i<want.length; i++){
            map1.put(want[i], number[i]);
        }
        for(int i=0; i<=discount.length - 10; i++){
            String[] tempArr = Arrays.copyOfRange(discount, i, i+10);
            if(is_right(map1, tempArr))
                answer++;
        }
        return answer;
    }
    
    boolean is_right(HashMap<String, Integer> map, String[] arr){
        HashMap<String, Integer> tempMap = new HashMap<>(map);
        for(int i=0; i<arr.length; i++){
            if(!tempMap.containsKey(arr[i]))
                return false;
            else{
                if(tempMap.get(arr[i]) > 0)
                    tempMap.put(arr[i], tempMap.get(arr[i]) - 1);
                else
                    return false;
            }
        }
        return true;
    }
}