class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        for(int i=1; i<=yellow; i++){
            if(yellow % i == 0){
                int temp = yellow / i;
                if(i+i+temp+temp+4 == brown){
                    answer[0] = i+2;
                    answer[1] = temp+2;
                }
            }
        }
        return answer;
    }
}