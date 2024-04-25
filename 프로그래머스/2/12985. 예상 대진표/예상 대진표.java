class Solution{
    public int solution(int n, int a, int b){
        int answer = 1;
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        
        if(max - min == 1 && max%2 ==0 && min %2 !=0)
            return answer;
        
        while(true){
            max = max%2==0 ? max/2 : (max+1)/2;
            min = min%2==0 ? min/2 : (min+1)/2;
            answer++;
            if(max - min == 1 && max%2 == 0 && min %2 != 0)
                break;
        }
        
        return answer;
    }
}