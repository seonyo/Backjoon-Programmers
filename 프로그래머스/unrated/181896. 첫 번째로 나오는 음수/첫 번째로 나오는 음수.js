function solution(num_list) {
    var answer = -1;
    for(i in num_list){
        if(num_list[i] < 0) return Number(i);
    }
    return answer;
}