class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        while(!s.equals("1")){
            answer[1] += s.replaceAll("1", "").length();
            s = Integer.toBinaryString(s.replaceAll("0","").length());
            answer[0]++;
        }
        return answer;
    }
}