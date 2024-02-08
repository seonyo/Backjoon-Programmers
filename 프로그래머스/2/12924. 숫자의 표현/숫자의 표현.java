class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            int sum = i;
            int cnt = 0;
            while(cnt < n){
                cnt+=sum;
                if(cnt == n){
                    answer++;
                    break;
                }
                sum++;
            }
        }
        return answer;
    }
}