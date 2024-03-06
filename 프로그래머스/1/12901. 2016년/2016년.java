class Solution {
    public String solution(int a, int b) {
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"}; 
        int tempDay = 0;
        for(int i=0; i<a-1; i++){
            tempDay += day[i];
        }
        tempDay += b;
        
        return dayWeek[(tempDay-1)%7];
    }
}