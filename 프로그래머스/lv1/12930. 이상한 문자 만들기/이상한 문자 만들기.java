class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt=1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                cnt = 0;
            }
            answer += (cnt%2==0) ? Character.toLowerCase(s.charAt(i)) : Character.toUpperCase(s.charAt(i));
            cnt++;
        }
        return answer;
    }
}