class Solution
{
    public int solution(String s)
    {
        int answer = 0;

        for(int i=0; i<s.length(); i++){
            int len1 = palindrome(s, i, i);
            int len2 = palindrome(s, i, i+1);
            answer = Math.max(answer, Math.max(len1, len2));
        }

        return answer;
    }
    int palindrome(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}