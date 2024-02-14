class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int prevWidth = 0;
        int prevHeight = 0;
        
        for(int i=0; i<sizes.length; i++){
            int maxLength = Math.max(sizes[i][0], sizes[i][1]);
            int minLength = Math.min(sizes[i][0], sizes[i][1]);
            
            prevWidth = Math.max(maxLength, prevWidth);
            prevHeight = Math.max(minLength, prevHeight);
        }
        return prevWidth * prevHeight;
    }
}