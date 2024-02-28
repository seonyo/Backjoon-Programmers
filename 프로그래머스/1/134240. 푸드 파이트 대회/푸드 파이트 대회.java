class Solution {
    public String solution(int[] food) {
        StringBuffer answer = new StringBuffer();
        for(int i=1; i<food.length; i++){
            int food_amount = food[i] % 2 == 0 ? food[i] : food[i] -1;
            for(int j=0; j<food_amount; j++){
                answer.insert(answer.length()/2, i);
            }
        }
        answer.insert(answer.length()/2, 0);
        return answer.toString();
    }
}