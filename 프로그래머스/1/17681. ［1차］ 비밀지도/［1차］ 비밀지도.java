class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<n; i++){
            String map1 = String.format("%"+n+"s", Integer.toBinaryString(arr1[i])).replaceAll(" ", "0");
            String map2 = String.format("%"+n+"s", Integer.toBinaryString(arr2[i])).replaceAll(" ", "0");
            String temp = "";
            for(int j = 0; j<n; j++){
                if(map1.charAt(j) == '0' && map2.charAt(j) == '0')
                    temp += " ";
                else
                    temp += "#";
            }
            answer[i] = temp;
        }
        return answer;
    }
}