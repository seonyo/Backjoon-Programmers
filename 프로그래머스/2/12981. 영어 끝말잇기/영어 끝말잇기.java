import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        
        for(int i=1; i<words.length; i++){
            char before_word = words[i-1].charAt(words[i-1].length()-1);
            char after_word = words[i].charAt(0);
            if(before_word != after_word){
                answer[0] = (i%n) + 1;
                answer[1] = (i+n) / n;
                return answer;
            }
            if(Arrays.asList(words).indexOf(words[i]) != i){
                answer[0] = (i%n) + 1;
                answer[1] = (i+n) / n;
                return answer;
            }
        }

        return answer;
    }
}