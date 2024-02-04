import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        List <Integer> answer = new ArrayList <Integer>();
        int[] temp = {0,0,0};
        int[] way1 = {1,2,3,4,5};
        int[] way2 = {2,1,2,3,2,4,2,5};
        int[] way3 = {3,3,1,1,2,2,4,4,5,5};
        
        for(int i=0; i<answers.length; i++){
            if(way1[i % way1.length] == answers[i]){
                temp[0]++;
            }
            if(way2[i % way2.length] == answers[i]){
                temp[1]++;
            }
            if(way3[i % way3.length] == answers[i]){
                temp[2]++;
            }
        }
        int max = Arrays.stream(temp).max().getAsInt();
        
        for(int i=0; i<3; i++){
            if(temp[i] == max){
                answer.add(i+1);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}