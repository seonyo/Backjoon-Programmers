import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int sum = 0;
        HashSet <Integer> set = new HashSet<>();

        for(int i=1; i<elements.length; i++){ // 연속 수열 길이
            for(int j=0; j<elements.length; j++){ // 배열 접근 인덱스
                for(int k=j; k<i+j; k++){ // 수열 길이에 맞춰 더하는 부분
                    sum+=elements[k%elements.length];
                }
                set.add(sum);
                sum=0;
            }
        }
        return set.size()+1;
    }
}