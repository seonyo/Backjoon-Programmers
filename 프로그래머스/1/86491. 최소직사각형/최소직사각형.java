class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        for(int i=0; i<sizes.length; i++){
            int maxLength = Math.max(sizes[i][0], sizes[i][1]);
            int minLength = Math.min(sizes[i][0], sizes[i][1]);
            
            width = Math.max(maxLength, width);
            height = Math.max(minLength, height);
        }
        return width * height;
    }
}