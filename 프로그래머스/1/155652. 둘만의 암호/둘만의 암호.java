class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String temp = "";
        
        for(int i=0; i<alphabet.length(); i++){
            if(!skip.contains(String.valueOf(alphabet.charAt(i)))){
                temp += alphabet.charAt(i);
            }
        }
                
        for(int i=0; i<s.length(); i++){
            int alphabet_index = temp.indexOf(s.charAt(i)) + index;
            if(alphabet_index >= temp.length()){
                while(alphabet_index >= temp.length()){
                    alphabet_index -= temp.length();
                }
                answer += temp.charAt(alphabet_index);
            } else {
                answer += temp.charAt(alphabet_index);
            }
        }
        return answer;
    }
}