class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuffer str = new StringBuffer(s);
        for(int i=0; i<s.length(); i++){
            String temp = str.substring(1);
            str.append(temp).append(Character.toString(str.charAt(0)));
            str.delete(0, s.length());
            if(is_right(str))
                answer++;
        }
        return answer;
    }
    
    boolean is_right(StringBuffer str){
        String temp = str.toString();
        while(!temp.equals("")){
            if(temp.contains("()"))
                temp = temp.replaceAll("\\(\\)", "");
            else if(temp.contains("[]"))
                temp = temp.replaceAll("\\[\\]", ""); 
            else if(temp.contains("{}"))
                temp = temp.replaceAll("\\{\\}", "");
            else{
                return false;
            }
        }
        return true;
    }
}