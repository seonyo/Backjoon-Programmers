class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int [2];
        int max = n > m ? n : m;
        int min = n < m ? n : m;
        
        //최대공약수
        for(int i=1; i<=min; i++){
            if(min%i==0 && max%i==0) answer[0] = i;
        }
        
        //최소공배수
        int cnt=1;
        while(true){
            if(max*cnt%min == 0){
                answer[1] = max*cnt;
                break;
            }
            cnt++;
        }
            
        return answer;
    }
}