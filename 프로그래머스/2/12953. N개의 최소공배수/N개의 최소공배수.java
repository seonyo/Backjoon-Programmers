class Solution {
    public int solution(int[] arr) {
        int lcm = 0;
        for(int i=0; i<arr.length; i++){
            if(i == 0){
                lcm = getLcm(arr[i], arr[i+1]);
                i = 1;
            }
            else{
                lcm = getLcm(lcm, arr[i]);
            } 
        }
        return lcm;
    }
    
    int getLcm(int num1, int num2){
        int max = num1 >= num2 ? num1 : num2;
        int min = num1 < num2 ? num1: num2;
        int gcd = 1;
        for(int i=1; i<=min; i++){
            if(max % i == 0 && min % i == 0)
                gcd = i;
        }
        
        return num1 * num2 / gcd;
    }
}