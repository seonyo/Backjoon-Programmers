class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;  // 콜라 갯수
        int left_cola = 0;
        
        while(n >= a){
            answer += (n/a)*b;
            left_cola = n%a;
            n = (n/a)*b + left_cola;
            System.out.println(answer + " " + left_cola + " " + n);
        }
        
        return answer;
    }
}