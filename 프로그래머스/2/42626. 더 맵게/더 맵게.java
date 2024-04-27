import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.stream(scoville).boxed().collect(Collectors.toList()));
        
        while(pq.peek() < K){
            if(pq.size() == 1)
                return -1;
            int mix = pq.poll() + (pq.poll()*2);
            pq.add(mix);
            answer++;
        }
        return answer;
    }
}