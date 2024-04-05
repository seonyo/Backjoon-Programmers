class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean flag = false;
        for(int i=2; i<=n; i++){
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i % j == 0){
                    flag = true;
                    break;
                }
            }
            if(!flag)
                answer++;
            flag = false;
        }
        return answer;
    }
}