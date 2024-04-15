import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        Integer[] lostInteger = Arrays.stream(lost).boxed().toArray(Integer[]::new);
        List<Integer> tempLost = new ArrayList<>(Arrays.asList(lostInteger));
        
        Integer[] reserveInteger = Arrays.stream(reserve).boxed().toArray(Integer[]::new);
        List<Integer> tempReserve = new ArrayList<>(Arrays.asList(reserveInteger));
        
        for(int i=0; i<tempLost.size(); i++){
            for(int j=0; j<tempReserve.size(); j++){
                if(tempLost.get(i) == tempReserve.get(j)){
                    answer++;
                    tempLost.remove(i);
                    tempReserve.remove(j);
                    i--;
                    break;
                }
            }
        }
        
        for(int i=0; i<tempLost.size(); i++){
            for(int j=0; j<tempReserve.size(); j++){
                if(Math.abs(tempLost.get(i) - tempReserve.get(j)) == 1){
                    answer++;
                    tempReserve.remove(j);
                    break;
                }
            }
        }
        
        return answer;
    }
}