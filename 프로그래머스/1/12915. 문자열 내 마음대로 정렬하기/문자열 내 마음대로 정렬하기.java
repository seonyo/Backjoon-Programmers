import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        char[] stringsN = new char[strings.length];
        List<String> stringsList = new ArrayList<>(Arrays.asList(strings));
        
        for(int i=0; i<stringsN.length; i++){
            stringsN[i] = strings[i].charAt(n);
        }
        
        Collections.sort(stringsList);
        Arrays.sort(stringsN);

        for(int i=0; i<stringsN.length; i++){
            for(int j = 0; j<stringsN.length; j++){
                if(stringsN[i] == stringsList.get(j).charAt(n)){
                    answer[i] = stringsList.get(j);
                    stringsList.remove(j);
                    break;
                }
            }
        }
        
        return answer;
    }
}