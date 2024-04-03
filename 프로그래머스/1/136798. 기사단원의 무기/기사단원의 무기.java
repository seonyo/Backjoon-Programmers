class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i<=number; i++){
            int divisor = divisor_count(i);
            answer += divisor > limit ? power : divisor;
        }
        return answer;
    }
    
    int divisor_count(int num){
        int cnt = 0;
        for(int i=1; i*i<=num; i++){
            if(i * i == num) cnt++;
            else if(num % i == 0) cnt+=2;
        }
        return cnt;
    }
}