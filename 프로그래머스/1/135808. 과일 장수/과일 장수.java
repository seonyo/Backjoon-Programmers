import java.util.*;
import java.io.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] tmp = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Collections.reverseOrder());
        
        if(tmp.length % m != 0) {
            tmp = Arrays.copyOfRange(tmp, 0, tmp.length - (tmp.length % m));
        }
                
        for(int i=0; i<tmp.length; i+=m){
            Integer[] sliceTmp = Arrays.copyOfRange(tmp, i, i+m);
            answer+= sliceTmp[sliceTmp.length-1] * m;
        }
        return answer;
    }
}