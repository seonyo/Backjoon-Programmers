class Solution {
    public long solution(int n) {
        int answer [] = new int [n+1];
        
        for(int i=1; i<=n; i++){
            if(i==1) answer[i] = 1;
            else if (i == 2) answer[i] = 2;
            else {
                int sum = answer[i-2] + answer[i-1];
                answer[i] = sum % 1234567;
            }
        }
        return answer[n];
    }
}