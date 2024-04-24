import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        int[] arr = new int [(int)right - (int)left +1];
        
        int index = 0;
        for(long i=left; i<=right; i++){
            arr[index] = (int)Math.max(i/n, (i%n))+1;
            index++;
        }
        return arr;
    }
}