class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
         int [] answer = new int [str.length()];
        
        for(int i=str.length()-1; i>=0; i--){
            answer[i]= str.charAt(str.length()-i-1)-'0' ;
        }
        return answer;
    }
}