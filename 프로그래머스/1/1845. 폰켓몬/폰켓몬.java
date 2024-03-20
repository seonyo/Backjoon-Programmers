import java.util.*;
class Solution {
    public int solution(int[] nums) {
        List <Integer> temp = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(!temp.contains(nums[i])){
                temp.add(nums[i]);
            }
        }
        return temp.size() > nums.length/2 ? nums.length/2 : temp.size();
    }
}