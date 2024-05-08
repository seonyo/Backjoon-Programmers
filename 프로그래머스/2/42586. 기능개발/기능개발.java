import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int cnt = 1;
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();
        
        for(int i = 0; i < progresses.length; i++){
            queue.add((int)Math.ceil((double)(100 - progresses[i]) / speeds[i]));
        }

        int temp = queue.poll();
        while(!queue.isEmpty()){
            if(queue.isEmpty()){ 
                answerList.add(cnt);
                break;
            }              
            else if(temp >= queue.peek()){
                queue.remove();
                cnt++;
            }
            else{
                answerList.add(cnt);
                temp = queue.poll();
                cnt = 1;
            }
        }
        answerList.add(cnt);
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}