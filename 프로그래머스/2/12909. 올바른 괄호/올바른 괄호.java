class Solution {
    boolean solution(String s) {
        boolean answer = true;
        //String temp[] = s.split("");
        int cnt=0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                cnt++;
            } else{
                if(cnt <= 0){
                    return false;
                } else{
                    cnt--;
                }
            }
        }
        
        if(cnt != 0) answer = false;

        return answer;
    }
}